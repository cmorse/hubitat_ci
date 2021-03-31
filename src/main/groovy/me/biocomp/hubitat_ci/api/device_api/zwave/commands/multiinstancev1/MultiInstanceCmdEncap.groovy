package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstancev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiInstanceCmdEncap implements Command
{
    Short command
    Short commandClass
    Short instance
    List parameter
    abstract MultiInstanceCmdEncap encapsulate(Command arg0)
    abstract Command encapsulatedCommand(Map arg0)
}