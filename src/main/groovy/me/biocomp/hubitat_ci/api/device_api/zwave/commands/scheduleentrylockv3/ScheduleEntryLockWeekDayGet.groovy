package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockWeekDayGet implements Command
{
    Short scheduleSlotId
    Short userIdentifier
}