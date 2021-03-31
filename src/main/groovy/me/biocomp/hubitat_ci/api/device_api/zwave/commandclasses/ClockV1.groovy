package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.clockv1.ClockGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.clockv1.ClockReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.clockv1.ClockSet

trait ClockV1
{
    abstract ClockGet clockGet(Map arg0=null)
    abstract ClockReport clockReport(Map arg0=null)
    abstract ClockSet clockSet(Map arg0=null)
}
