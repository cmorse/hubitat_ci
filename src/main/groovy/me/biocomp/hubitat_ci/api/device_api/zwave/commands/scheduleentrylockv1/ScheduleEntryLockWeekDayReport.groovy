package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockWeekDayReport implements Command
{
    Short dayOfWeek
    Short scheduleSlotId
    Short startHour
    Short startMinute
    Short stopHour
    Short stopMinute
    Short userIdentifier
}