package me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BatteryReport implements Command
{
    Boolean backupBattery
    Short batteryLevel
    Short chargingStatus
    Boolean disconnected
    Boolean lowFluid
    Boolean overheating
    Boolean rechargeable
    Short replaceRecharge
    static short BATTERY_LOW_WARNING = 255
    static short CHARGING_STATUS_CHARGING = 1
    static short CHARGING_STATUS_DISCHARGING = 0
    static short CHARGING_STATUS_MAINTAINING = 2
}