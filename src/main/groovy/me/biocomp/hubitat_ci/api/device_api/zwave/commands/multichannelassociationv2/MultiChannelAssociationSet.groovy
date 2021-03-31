package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelAssociationSet implements Command
{
    Short groupingIdentifier
    List multiChannelNodeIds
    List nodeId
}