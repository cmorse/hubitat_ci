package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGroupNameGet implements Command
{
    Short groupingIdentifier
}