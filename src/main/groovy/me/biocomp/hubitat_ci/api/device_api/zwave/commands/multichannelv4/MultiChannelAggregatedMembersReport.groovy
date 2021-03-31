package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelAggregatedMembersReport implements Command
{
    Short aggregatedEndPoint
    List aggregatedMembers
    Short bitMasks
}