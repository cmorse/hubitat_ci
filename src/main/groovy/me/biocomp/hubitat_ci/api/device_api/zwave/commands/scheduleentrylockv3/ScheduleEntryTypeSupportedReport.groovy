package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryTypeSupportedReport implements Command
{
    Short numberOfSlotsDailyRepeating
    Short numberOfSlotsWeekDay
    Short numberOfSlotsYearDay
}