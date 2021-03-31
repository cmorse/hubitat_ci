package me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RemoteAssociationConfigurationGet implements Command
{
    Short localGroupingIdentifier
}