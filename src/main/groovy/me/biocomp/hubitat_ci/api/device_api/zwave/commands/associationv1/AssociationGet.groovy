package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGet implements Command
{
    Short groupingIdentifier
}