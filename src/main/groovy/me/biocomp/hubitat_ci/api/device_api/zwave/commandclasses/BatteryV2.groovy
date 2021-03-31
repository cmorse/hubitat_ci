package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2.BatteryGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2.BatteryHealthGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2.BatteryHealthReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2.BatteryReport

trait BatteryV2
{
    abstract BatteryGet batteryGet(Map arg0=null)
    abstract BatteryHealthGet batteryHealthGet(Map arg0=null)
    abstract BatteryHealthReport batteryHealthReport(Map arg0=null)
    abstract BatteryReport batteryReport(Map arg0=null)
}
