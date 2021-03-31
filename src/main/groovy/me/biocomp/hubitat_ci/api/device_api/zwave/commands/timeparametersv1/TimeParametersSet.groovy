package me.biocomp.hubitat_ci.api.device_api.zwave.commands.timeparametersv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TimeParametersSet implements Command
{
    Short day
    Short hourUtc
    Short minuteUtc
    Short month
    Short secondUtc
    Integer year
}