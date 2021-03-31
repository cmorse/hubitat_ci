package me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterpulsev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterPulseReport implements Command
{
    Integer pulseCount
}