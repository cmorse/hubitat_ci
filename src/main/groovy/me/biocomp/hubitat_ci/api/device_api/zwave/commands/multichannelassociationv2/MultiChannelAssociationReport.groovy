package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelAssociationReport implements Command
{
    Short groupingIdentifier
    Short maxNodesSupported
    List multiChannelNodeIds
    List nodeId
    Short reportsToFollow
}