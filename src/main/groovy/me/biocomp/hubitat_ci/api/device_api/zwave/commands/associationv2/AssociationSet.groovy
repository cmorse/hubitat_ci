package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationSet implements Command
{
    Short groupingIdentifier
    Object nodeId
}