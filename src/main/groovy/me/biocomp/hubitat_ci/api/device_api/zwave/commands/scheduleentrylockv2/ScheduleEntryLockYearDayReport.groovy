package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockYearDayReport implements Command
{
    Short scheduleSlotId
    Short startDay
    Short startHour
    Short startMinute
    Short startMonth
    Short startYear
    Short stopDay
    Short stopHour
    Short stopMinute
    Short stopMonth
    Short stopYear
    Short userIdentifier
}