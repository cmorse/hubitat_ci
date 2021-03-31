package me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RateTblHistoricalDataGet implements Command
{
    Integer datasetRequested
    Short maximumReports
    Short rateParameterSetId
    Short startDay
    Short startHourLocalTime
    Short startMinuteLocalTime
    Short startMonth
    Short startSecondLocalTime
    Integer startYear
    Short stopDay
    Short stopHourLocalTime
    Short stopMinuteLocalTime
    Short stopMonth
    Short stopSecondLocalTime
    Integer stopYear
}