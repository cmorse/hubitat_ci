package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGroupCommandListReport implements Command
{
    List command
    Short groupingIdentifier
    Short listLength
}