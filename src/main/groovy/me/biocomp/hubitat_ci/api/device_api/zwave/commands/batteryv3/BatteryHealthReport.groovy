package me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BatteryHealthReport implements Command
{
    List batteryTemperature
    Short maximumCapacity
    Short precision
    Short scale
    BigDecimal scaledBatteryTemperature
    Short size
}