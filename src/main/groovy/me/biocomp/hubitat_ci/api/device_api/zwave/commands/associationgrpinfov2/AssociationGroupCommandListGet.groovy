package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGroupCommandListGet implements Command
{
    Boolean allowCache
    Short groupingIdentifier
}