package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockWeekDaySet implements Command
{
    Short dayOfWeek
    Short scheduleSlotId
    Short setAction
    Short startHour
    Short startMinute
    Short stopHour
    Short stopMinute
    Short userIdentifier
}