package me.biocomp.hubitat_ci.api.device_api.zwave.commands.groupingnamev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait GroupingNameGet implements Command
{
    Short groupingIdentifier
}