package me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationactivatev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RemoteAssociationActivate implements Command
{
    Short groupingIdentifier
}