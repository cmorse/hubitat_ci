package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiInstanceAssociationGet implements Command
{
    Short groupingIdentifier
}