package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelCmdEncap implements Command
{
    Boolean bitAddress
    Short command
    Short commandClass
    Short destinationEndPoint
    List parameter
    Boolean res01
    Short sourceEndPoint
    abstract MultiChannelCmdEncap encapsulate(Command arg0)
    abstract Command encapsulatedCommand(Map arg0)
}