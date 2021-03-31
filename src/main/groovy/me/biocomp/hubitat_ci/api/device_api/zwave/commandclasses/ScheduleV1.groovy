package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.CommandScheduleGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.CommandScheduleReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.CommandScheduleSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleStateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleStateReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleStateSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleSupportedReport

trait ScheduleV1
{
    abstract CommandScheduleGet commandScheduleGet(Map arg0=null)
    abstract CommandScheduleReport commandScheduleReport(Map arg0=null)
    abstract CommandScheduleSet commandScheduleSet(Map arg0=null)
    abstract ScheduleRemove scheduleRemove(Map arg0=null)
    abstract ScheduleStateGet scheduleStateGet(Map arg0=null)
    abstract ScheduleStateReport scheduleStateReport(Map arg0=null)
    abstract ScheduleStateSet scheduleStateSet(Map arg0=null)
    abstract ScheduleSupportedGet scheduleSupportedGet(Map arg0=null)
    abstract ScheduleSupportedReport scheduleSupportedReport(Map arg0=null)
}
