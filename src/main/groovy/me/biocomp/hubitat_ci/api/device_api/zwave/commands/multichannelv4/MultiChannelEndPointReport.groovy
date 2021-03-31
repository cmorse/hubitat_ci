package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelEndPointReport implements Command
{
    Short aggregatedEndPoints
    Boolean dynamic
    Short endPoints
    Boolean identical
}