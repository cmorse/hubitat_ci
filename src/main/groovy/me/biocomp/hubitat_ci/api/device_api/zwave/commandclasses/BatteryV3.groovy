package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3.BatteryGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3.BatteryHealthGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3.BatteryHealthReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3.BatteryReport

trait BatteryV3
{
    abstract BatteryGet batteryGet(Map arg0=null)
    abstract BatteryHealthGet batteryHealthGet(Map arg0=null)
    abstract BatteryHealthReport batteryHealthReport(Map arg0=null)
    abstract BatteryReport batteryReport(Map arg0=null)
}
