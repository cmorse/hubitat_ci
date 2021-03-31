package me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BatteryReport implements Command
{
    Short batteryLevel
    static short BATTERY_LOW_WARNING = 255
}