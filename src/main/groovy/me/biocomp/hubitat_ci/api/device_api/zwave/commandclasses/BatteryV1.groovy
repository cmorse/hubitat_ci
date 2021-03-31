package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv1.BatteryGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv1.BatteryReport

trait BatteryV1
{
    abstract BatteryGet batteryGet(Map arg0=null)
    abstract BatteryReport batteryReport(Map arg0=null)
}
