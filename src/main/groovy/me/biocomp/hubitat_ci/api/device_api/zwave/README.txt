How to update zwave classes:

1. Update ZwaveMethods.txt with hubitat driver using class 'hubitat.zwave.Zwave'
1. Run build_zwave_command_classes.py (Uses ZwaveMethods.txt to create ZwaveCommandClasses.txt)
1. Paste ZwaveCommandClasses.txt into hubitat driver and put output into ZwaveCommandClassesMethods.txt
1. Run build_zwave_commands.py (Uses ZwaveCommandClassesMethods.txt to create ZwaveCommands.txt)
1. Paste ZwaveCommands.txt into hubitat driver and put output into ZwaveCommandMethods.txt
1. Run create_zwave_commands.py (Uses ZwaveCommandsMethods.txt and ZwaveCommandClassesMethods.txt to create classes in commands/ and commandclasses/