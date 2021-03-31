package me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterTblHistoricalDataGet implements Command
{
    Integer historicalDatasetRequested
    Short maximumReports
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