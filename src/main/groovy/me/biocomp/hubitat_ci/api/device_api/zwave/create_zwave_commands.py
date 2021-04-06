#!/usr/bin/env python3

# This script uses the data in ZwaveCommandClassesMethods.txt to create all of the commands
# and commandclasses

from collections import OrderedDict

from io import BytesIO
from shutil import copyfileobj

import os
import re

base_path = os.path.dirname(os.path.realpath(__file__))

command_classes_methods = open(os.path.join(base_path, 'ZwaveCommandClassesMethods.txt'))
commands_methods = open(os.path.join(base_path, 'ZwaveCommandsMethods.txt'))

commands_base_path = os.path.join(base_path, 'commands')
commandclasses_base_path = os.path.join(base_path, 'commandclasses')

import_path = 'me.biocomp.hubitat_ci.api.device_api.zwave'

function_name_and_args_pattern = re.compile('([^\.]*)\((.*)\)$')
function_arg_pattern = re.compile('\((.*)\)$')
class_static_value_pattern = re.compile('^([\d\w_]*) ([A-Z\d_]*) = (\d+)$')

def main():
    if not os.path.exists(commands_base_path):
        os.mkdir(commands_base_path)
    if not os.path.exists(commandclasses_base_path):
            os.mkdir(commandclasses_base_path)

    commandclasses = []
    commands = {}
    curcommandclass = None
    curcommands = {}

    for line in command_classes_methods.readlines():
        line = line.strip()

        if line.startswith('class hubitat.zwave.commandclasses'):
            curcommandclass = line.split('.')[-1][:-1] # Remove trailing colon
            commandclasses.append(curcommandclass)
            continue

        if line == ']':
            commands[curcommandclass] = curcommands
            curcommandclass = None
            curcommands = {}
            continue

        if line.startswith('public static hubitat.zwave.commands.'):
            if curcommandclass is None:
                print("Error: Expected to have a curcommandclass for line " + line)
                continue

            line = line[37:] # Remove 'public static hubitat.zwave.commands.'
            split = line.split(' ')

            # Get the function arguments
            argument = function_arg_pattern.search(split[-1]).group(1)

            command = split[0].split('.')[1]

            if command not in curcommands:
                curcommands[command] = []

            curcommands[command].append(argument)

    commandclasses.sort()

    #
    # Create files in 'commands' package
    #

    cur_command_package = None
    cur_command_class = None
    cur_command_class_functions = OrderedDict()
    cur_command_class_statics = []

    for line in commands_methods.readlines():
        line = line.strip()

        if line.startswith('class hubitat.zwave.commands'):
            split = line.split('.')
            cur_command_package = split[-2]
            cur_command_class = split[-1][:-1] # Remove trailing colon

            directory = os.path.join(commands_base_path, cur_command_package)

            if not os.path.exists(directory):
                print ("Making directory '" + directory + "'")
                os.mkdir(directory)

            cur_command_class_functions = OrderedDict()
            cur_command_class_statics = []
            continue

        if line == ']':
            buffer = BytesIO()

            buffer.write('package me.biocomp.hubitat_ci.api.device_api.zwave.commands.' + cur_command_package + '\n\n')
            buffer.write('import me.biocomp.hubitat_ci.api.device_api.zwave.Command\n\n')
            buffer.write('trait ' + cur_command_class + ' implements Command\n')
            buffer.write('{\n')

            member_variables = {}

            # First find all of the getters and setters. Change them to static member variables
            for function_name, config in cur_command_class_functions.items():
                if not function_name.startswith('get'):
                    continue

                config = cur_command_class_functions[function_name]

                get_function_name = function_name
                short_function_name = function_name[3:] # 'Remove the 'get'
                set_function_name = 'set' + short_function_name

                del cur_command_class_functions[get_function_name]
                if set_function_name in cur_command_class_functions:
                    del cur_command_class_functions[set_function_name]

                name = lower_first(short_function_name)

                member_variables[name] = config['return_type']

                buffer.write('    ' + config['return_type'] + ' ' + name + '\n')

            for function_name in cur_command_class_functions:
                config = cur_command_class_functions[function_name]

                # Hubitat seems to have some functions that start with 'is*' and return a member variable of the same name
                if function_name.startswith('is') and config['return_type'] == 'boolean':
                    member_name = lower_first(function_name[2:])
                    if member_name in member_variables and member_variables[member_name] == 'boolean':
                        buffer.write('    boolean ' + function_name + '() { return ' + member_name + ' }\n')
                        continue

                buffer.write('    abstract ' + config['return_type'] + ' ' + function_name + '(' + default_args_dec(config['arguments']) + ')\n')

            for config in sorted(cur_command_class_statics, key = lambda x : x['name']):
                buffer.write('    static ' + config['datatype'] + ' ' + config['name'] + ' = ' + config['value'] + '\n')

            buffer.write('}')

            with open(os.path.join(directory, cur_command_class + '.groovy'), 'w') as output_file:
                buffer.seek(0)
                copyfileobj(buffer, output_file)
                buffer.close()

            cur_command_package = None
            cur_command_class = None

            continue

        if line.startswith('public static '):
            line = line[14:] # Remove 'public static '
        elif line.startswith('public '):
            line = line[7:] # Remove 'public '
        elif line == 'Methods:[':
            continue
        else:
            print ("Warning: Line doesn't start with 'public' or 'public static': " + line)
            continue

        split = line.split(' ')

        function_call = split[1]

        result = function_name_and_args_pattern.search(function_call)

        if result is not None:
            # Ignore inherited functions
            if function_call.startswith('hubitat.zwave.Command.'):
                #print ("Skipping: " + function_call)
                continue

            function_name = result.group(1)

            # Exclude inherited functions
            if is_bad_function_name(function_name):
                continue

            # Get the arguments
            arguments = result.group(2).split(',')
            if arguments == ['']:
                arguments = []
            arguments = [x.replace('hubitat.zwave.Command', 'Command') for x in arguments]

            return_type = split[0]

            if return_type == 'hubitat.zwave.Command':
                return_type = 'Command'
            elif return_type == 'hubitat.zwave.commands.' + cur_command_package + '.' + cur_command_class:
                return_type = cur_command_class

            new_vals = {
               'return_type': return_type,
               'arguments': arguments
            }

            if function_name in cur_command_class_functions and cur_command_class_functions[function_name] != new_vals:
                print ('Error: function ' + function_name + ' already exists')
                print(cur_command_class_functions[function_name])
                print(new_vals)

            cur_command_class_functions[function_name] = new_vals
        else:
            result = class_static_value_pattern.search(line)

            cur_command_class_statics.append({
                'name': result.group(2),
                'datatype': result.group(1),
                'value': result.group(3),
            })

    print ("Finished making Commands")

    #
    # Create the Zwave.groovy file
    #

    buffer = BytesIO()
    buffer.write('package ' + import_path + '\n\n')

    for commandclass in commandclasses:
        buffer.write('import ' + import_path + '.commandclasses.' + commandclass + '\n')

    buffer.write('\n')
    buffer.write('trait Zwave\n')
    buffer.write('{\n')
    for commandclass in commandclasses:
        buffer.write('    abstract ' + commandclass + ' get' + commandclass + '()\n')

    buffer.write('\n')

    buffer.write('    abstract Command getCommand(' + default_args_dec(['byte', 'byte', 'byte[]', ('Integer', 'null')]) + ')\n')
    buffer.write('    abstract Command getCommand(' + default_args_dec(['Short', 'Short', 'List', ('Integer', 'null')]) + ')\n')
    buffer.write('    abstract Command parse(String command, ' + default_args_dec([('boolean', 'false')]) + ')\n')
    buffer.write('    abstract Command parse(String command, Map commandClassVersions, ' + default_args_dec([('boolean', 'false')]) + ')\n')

    buffer.write('}\n')

    with open(os.path.join(base_path, 'Zwave.groovy'), 'wt') as zwave_file:
        buffer.seek(0)
        copyfileobj(buffer, zwave_file)

    #
    # Create classes in 'commandclasses' package
    #

    for commandclass in commandclasses:
        cur_commands = commands[commandclass]
        sorted_cur_commands_keys = list(sorted(cur_commands))

        commandclass_lower = commandclass.lower()

        buffer = BytesIO()
        buffer.write('package ' + import_path + '.commandclasses\n\n')

        for command in sorted_cur_commands_keys:
            buffer.write('import ' + import_path + '.commands.' + commandclass_lower + '.' + command + '\n')

        buffer.write('\n')
        buffer.write('trait ' + commandclass + '\n')
        buffer.write('{\n')
        for command in sorted_cur_commands_keys:
            args = cur_commands[command]

            if args == ['']:
                args = []
            elif args == ['', 'Map']:
                args = [('Map', 'null')]

            buffer.write('    abstract ' + command + ' ' + lower_first(command) + '(' + default_args_dec(args) + ')\n')

        buffer.write('}\n')

        with open(os.path.join(commandclasses_base_path, commandclass + '.groovy'), 'w') as output_file:
            buffer.seek(0)
            copyfileobj(buffer, output_file)


    buffer = BytesIO()

    buffer.write('package me.biocomp.hubitat_ci.util\n\n')

    for commandclass in commandclasses:
        buffer.write('import ' + import_path + '.commandclasses.' + commandclass + '\n')

    buffer.write('\n')
    for classname in ['Command', 'Zwave']:
        buffer.write('import me.biocomp.hubitat_ci.api.device_api.zwave.' + classname + '\n')
    buffer.write('\n')

    buffer.write('import spock.lang.Specification\n\n')

    buffer.write('class MockZwaveSpecification extends Specification\n')
    buffer.write('{\n')

    for commandclass in commandclasses:
        cur_commands = commands[commandclass]
        sorted_cur_commands_keys = list(sorted(cur_commands))

        commandclass_lower = commandclass.lower()

        buffer.write('    ' + commandclass + ' create' + commandclass + 'Mock()\n')
        buffer.write('    {\n')

        # Some commands are special and need a default implementation
        for command in sorted_cur_commands_keys:
            if command in ['MultiChannelCmdEncap', 'SecurityMessageEncapsulation', 'SupervisionGet']:
                full_name = import_path + '.commands.' + commandclass_lower + '.' + command
                buffer.write('        def ' + lower_first(command) + 'Mock = Mock(' + full_name + ')\n')
                buffer.write('        {\n')
                buffer.write('            _ * encapsulate(_ as Command) >> { cmd -> return Mock(' + full_name + ') }\n')
                buffer.write('        }\n')

        buffer.write('        def mock = Mock(' + commandclass + ')\n')
        buffer.write('        {\n')
        for command in sorted_cur_commands_keys:
            command_lower_first = lower_first(command)
            # Some commands are special and need a default implementation
            if command == 'MultiChannelCmdEncap':
                buffer.write('            _ * ' + command_lower_first + '(*_) >> ' + command_lower_first + 'Mock\n')
            else:
                full_name = import_path + '.commands.' + commandclass_lower + '.' + command
                buffer.write('            _ * ' + command_lower_first + '(*_) >> Mock(' + full_name + ')\n')

        buffer.write('        }\n')
        buffer.write('        return mock\n')
        buffer.write('    }\n\n')

    buffer.write('    Zwave createZwaveMocks()\n')
    buffer.write('    {\n')
    buffer.write('        def mock =  Mock(Zwave)\n')
    buffer.write('        {\n')
    for commandclass in commandclasses:
        buffer.write('            _ * get' + commandclass + '() >> create' + commandclass + 'Mock()\n')
    buffer.write('        }\n')
    buffer.write('        return mock\n')
    buffer.write('    }\n')
    buffer.write('}\n')

    with open(os.path.join(commandclasses_base_path, '../../../../util', 'MockZwaveSpecification.groovy'), 'w') as output_file:
        buffer.seek(0)
        copyfileobj(buffer, output_file)

def default_args_dec(args):
    output = []

    for i, arg in enumerate(args):
        output.append(arg[0] if isinstance(arg, tuple) else arg)

        output.append(' arg' + str(i))

        if isinstance(arg, tuple):
            output.append('=' + str(arg[1]))

        if i < len(args) - 1:
            output.append(', ')

    return ''.join(output)

def lower_first(val):
    return val[0].lower() + val[1:]

def is_bad_function_name(function_name):
    for bad_function_name in ['format', 'getCMD', 'getCommandClassId', 'getCommandId', 'getPayload']:
        if function_name == bad_function_name:
            return True
        elif function_name.startswith('super') and function_name.endswith(bad_function_name):
            return True

    for bad_start in ['super', 'this$dist$', '__$swapInit']:
        if function_name.startswith(bad_start):
            return True

    return False

if __name__ == "__main__":
    main()