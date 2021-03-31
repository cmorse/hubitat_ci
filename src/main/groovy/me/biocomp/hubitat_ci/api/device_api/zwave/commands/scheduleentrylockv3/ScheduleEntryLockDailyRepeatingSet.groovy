package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockDailyRepeatingSet implements Command
{
    Short durationHour
    Short durationMinute
    Short scheduleSlotId
    Short setAction
    Short startHour
    Short startMinute
    Short userIdentifier
    Short weekDayBitmask
}