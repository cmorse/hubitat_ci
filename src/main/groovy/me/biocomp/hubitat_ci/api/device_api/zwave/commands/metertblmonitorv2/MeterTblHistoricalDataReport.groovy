package me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterTblHistoricalDataReport implements Command
{
    Integer dataset
    Short day
    Short hourLocalTime
    Short minuteLocalTime
    Short month
    Boolean operatingStatusIndication
    Short rateType
    Short reportsToFollow
    Short secondLocalTime
    Integer year
}