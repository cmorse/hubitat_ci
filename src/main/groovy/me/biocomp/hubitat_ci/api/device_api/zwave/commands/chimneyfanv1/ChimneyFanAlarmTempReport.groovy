package me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ChimneyFanAlarmTempReport implements Command
{
    Short precision
    Short scale
    BigDecimal scaledValue
    Short size
    List value
}