package me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HrvControlVentilationRateSet implements Command
{
    Short ventilationRate
}