package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockDailyRepeatingGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockDailyRepeatingReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockDailyRepeatingSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockEnableAllSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockEnableSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockTimeOffsetGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockTimeOffsetReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockTimeOffsetSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockWeekDayGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockWeekDayReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockWeekDaySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockYearDayGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockYearDayReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockYearDaySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryTypeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryTypeSupportedReport

trait ScheduleEntryLockV3
{
    abstract ScheduleEntryLockDailyRepeatingGet scheduleEntryLockDailyRepeatingGet(Map arg0=null)
    abstract ScheduleEntryLockDailyRepeatingReport scheduleEntryLockDailyRepeatingReport(Map arg0=null)
    abstract ScheduleEntryLockDailyRepeatingSet scheduleEntryLockDailyRepeatingSet(Map arg0=null)
    abstract ScheduleEntryLockEnableAllSet scheduleEntryLockEnableAllSet(Map arg0=null)
    abstract ScheduleEntryLockEnableSet scheduleEntryLockEnableSet(Map arg0=null)
    abstract ScheduleEntryLockTimeOffsetGet scheduleEntryLockTimeOffsetGet(Map arg0=null)
    abstract ScheduleEntryLockTimeOffsetReport scheduleEntryLockTimeOffsetReport(Map arg0=null)
    abstract ScheduleEntryLockTimeOffsetSet scheduleEntryLockTimeOffsetSet(Map arg0=null)
    abstract ScheduleEntryLockWeekDayGet scheduleEntryLockWeekDayGet(Map arg0=null)
    abstract ScheduleEntryLockWeekDayReport scheduleEntryLockWeekDayReport(Map arg0=null)
    abstract ScheduleEntryLockWeekDaySet scheduleEntryLockWeekDaySet(Map arg0=null)
    abstract ScheduleEntryLockYearDayGet scheduleEntryLockYearDayGet(Map arg0=null)
    abstract ScheduleEntryLockYearDayReport scheduleEntryLockYearDayReport(Map arg0=null)
    abstract ScheduleEntryLockYearDaySet scheduleEntryLockYearDaySet(Map arg0=null)
    abstract ScheduleEntryTypeSupportedGet scheduleEntryTypeSupportedGet(Map arg0=null)
    abstract ScheduleEntryTypeSupportedReport scheduleEntryTypeSupportedReport(Map arg0=null)
}
