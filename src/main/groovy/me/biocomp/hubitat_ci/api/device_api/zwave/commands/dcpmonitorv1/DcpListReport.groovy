package me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DcpListReport implements Command
{
    Short day
    Short dcpId
    Short durationHourTime
    Short durationMinuteTime
    Short durationSecondTime
    Short eventPriority
    Short hourLocalTime
    Short loadShedding
    Short minuteLocalTime
    Short month
    Short numberOfDc
    Short randomizationInterval
    Short reportsToFollow
    Short secondLocalTime
    Short startAssociationGroup
    Short startDay
    Short startHourLocalTime
    Short startMinuteLocalTime
    Short startMonth
    Short startSecondLocalTime
    Integer startYear
    Short stopAssociationGroup
    Integer year
}