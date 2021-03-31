package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelCapabilityGet implements Command
{
    Short endPoint
}