package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationSpecificGroupReport implements Command
{
    Short group
}