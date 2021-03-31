package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleChangedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleChangedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleOverrideGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleOverrideReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleOverrideSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleSet

trait ClimateControlScheduleV1
{
    abstract ScheduleChangedGet scheduleChangedGet(Map arg0=null)
    abstract ScheduleChangedReport scheduleChangedReport(Map arg0=null)
    abstract ScheduleGet scheduleGet(Map arg0=null)
    abstract ScheduleOverrideGet scheduleOverrideGet(Map arg0=null)
    abstract ScheduleOverrideReport scheduleOverrideReport(Map arg0=null)
    abstract ScheduleOverrideSet scheduleOverrideSet(Map arg0=null)
    abstract ScheduleReport scheduleReport(Map arg0=null)
    abstract ScheduleSet scheduleSet(Map arg0=null)
}
