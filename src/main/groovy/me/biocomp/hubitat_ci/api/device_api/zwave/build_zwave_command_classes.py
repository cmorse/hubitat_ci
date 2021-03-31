# This script takes the ZwaveMethods file and creates a series of dumpClass commands
# for use in the BioComp API driver

import os

base_path = os.path.dirname(os.path.realpath(__file__))

methods = open(os.path.join(base_path, 'ZwaveMethods.txt'))

def main():
    with open(os.path.join(base_path, 'ZwaveCommandClasses.txt'), 'w') as output_file:
        for line in methods.readlines():
            line = line.strip()

            if not line.startswith('public static java.lang.Class get'):
                continue

            # Get rid of everything we don't care about
            line = line.replace('public static java.lang.Class get', '')
            line = line.replace('()', '')

            output_file.write('    dumpClass(hubitat.zwave.commandclasses.' + line + '.class)\n')

if __name__ == "__main__":
    main()