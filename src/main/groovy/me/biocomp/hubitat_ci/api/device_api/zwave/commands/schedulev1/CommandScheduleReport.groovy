package me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandScheduleReport implements Command
{
    Short activeId
    Integer durationByte
    Short durationType
    Short numberOfCmdToFollow
    Short reportsToFollow
    Boolean res51
    Short scheduleId
    Short startDayOfMonth
    Short startHour
    Short startMinute
    Short startMonth
    Short startWeekday
    Short startYear
    Short userIdentifier
}