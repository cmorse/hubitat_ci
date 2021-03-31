package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandConfigurationGet implements Command
{
    Short groupingIdentifier
    Short nodeId
}