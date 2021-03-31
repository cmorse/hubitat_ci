package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelCapabilityReport implements Command
{
    List commandClass
    Boolean dynamic
    Short endPoint
    Short genericDeviceClass
    Short specificDeviceClass
}