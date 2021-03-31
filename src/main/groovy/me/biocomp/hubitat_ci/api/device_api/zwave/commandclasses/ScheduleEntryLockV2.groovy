package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockEnableAllSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockEnableSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockTimeOffsetGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockTimeOffsetReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockTimeOffsetSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockWeekDayGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockWeekDayReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockWeekDaySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockYearDayGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockYearDayReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockYearDaySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryTypeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryTypeSupportedReport

trait ScheduleEntryLockV2
{
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
