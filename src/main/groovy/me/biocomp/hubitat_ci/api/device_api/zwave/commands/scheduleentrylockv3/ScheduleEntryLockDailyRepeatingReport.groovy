package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockDailyRepeatingReport implements Command
{
    Short durationHour
    Short durationMinute
    Short scheduleSlotId
    Short startHour
    Short startMinute
    Short userIdentifier
    Short weekDayBitmask
}