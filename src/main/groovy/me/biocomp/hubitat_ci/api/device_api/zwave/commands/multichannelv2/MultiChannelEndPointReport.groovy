package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelEndPointReport implements Command
{
    Boolean dynamic
    Short endPoints
    Boolean identical
}