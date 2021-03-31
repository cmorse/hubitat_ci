package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockEnableAllSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockEnableSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockWeekDayGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockWeekDayReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockWeekDaySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockYearDayGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockYearDayReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockYearDaySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryTypeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryTypeSupportedReport

trait ScheduleEntryLockV1
{
    abstract ScheduleEntryLockEnableAllSet scheduleEntryLockEnableAllSet(Map arg0=null)
    abstract ScheduleEntryLockEnableSet scheduleEntryLockEnableSet(Map arg0=null)
    abstract ScheduleEntryLockWeekDayGet scheduleEntryLockWeekDayGet(Map arg0=null)
    abstract ScheduleEntryLockWeekDayReport scheduleEntryLockWeekDayReport(Map arg0=null)
    abstract ScheduleEntryLockWeekDaySet scheduleEntryLockWeekDaySet(Map arg0=null)
    abstract ScheduleEntryLockYearDayGet scheduleEntryLockYearDayGet(Map arg0=null)
    abstract ScheduleEntryLockYearDayReport scheduleEntryLockYearDayReport(Map arg0=null)
    abstract ScheduleEntryLockYearDaySet scheduleEntryLockYearDaySet(Map arg0=null)
    abstract ScheduleEntryTypeSupportedGet scheduleEntryTypeSupportedGet(Map arg0=null)
    abstract ScheduleEntryTypeSupportedReport scheduleEntryTypeSupportedReport(Map arg0=null)
}
