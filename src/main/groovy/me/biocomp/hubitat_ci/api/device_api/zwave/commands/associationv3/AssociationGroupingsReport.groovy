package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGroupingsReport implements Command
{
    Short supportedGroupings
}