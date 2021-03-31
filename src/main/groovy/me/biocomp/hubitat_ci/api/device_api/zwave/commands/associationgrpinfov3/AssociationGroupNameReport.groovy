package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGroupNameReport implements Command
{
    Short groupingIdentifier
    Short lengthOfName
    List name
}