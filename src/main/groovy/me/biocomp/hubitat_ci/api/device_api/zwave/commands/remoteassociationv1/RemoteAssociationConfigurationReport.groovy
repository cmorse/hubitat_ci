package me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RemoteAssociationConfigurationReport implements Command
{
    Short localGroupingIdentifier
    Short remoteGroupingIdentifier
    Short remoteNodeid
}