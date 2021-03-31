package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGroupInfoGet implements Command
{
    Short groupingIdentifier
    Boolean listMode
    Boolean refreshCache
}