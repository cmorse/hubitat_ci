# This script takes the ZwaveCommandClassesMethods.txt file and creates a series of dumpClass commands
# for use in the BioComp API driver

import os

base_path = os.path.dirname(os.path.realpath(__file__))

methods = open(os.path.join(base_path, 'ZwaveCommandClassesMethods.txt'))

def main():
    with open(os.path.join(base_path, 'ZwaveCommands.txt'), 'w') as output_file:


        parent_package = None

        for line in methods.readlines():
            line = line.strip()

            if line.startswith('class hubitat.zwave.commandclasses'):
                line = line[6:-1] # Remove 'class' and trailing colon
                parent_package = line.split('.')[-1].lower()
                continue

            if line == ']':
                parent_package = None

            if not line.startswith('public static hubitat.zwave.commands.'):
                continue

            # Get rid of everything we don't care about
            line = line.replace('public static hubitat.zwave.commands.', '')

            split = line.split(' ')[0].split('.')

            output_file.write('    dumpClass(hubitat.zwave.commands.' + parent_package + '.' + split[1] + '.class)\n')

if __name__ == "__main__":
    main()