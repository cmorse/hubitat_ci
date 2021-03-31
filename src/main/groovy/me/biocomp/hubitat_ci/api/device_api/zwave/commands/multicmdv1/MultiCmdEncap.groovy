package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multicmdv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiCmdEncap implements Command
{
    List data
    Short numberOfCommands
    abstract MultiCmdEncap encapsulate(List arg0)
    abstract List encapsulatedCommands(Map arg0)
}