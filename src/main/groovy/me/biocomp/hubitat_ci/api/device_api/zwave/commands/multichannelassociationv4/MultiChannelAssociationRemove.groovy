package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelAssociationRemove implements Command
{
    Short groupingIdentifier
    List multiChannelNodeIds
    List nodeId
    static Short MULTI_CHANNEL_ASSOCIATION_REMOVE_MARKER = 0
}