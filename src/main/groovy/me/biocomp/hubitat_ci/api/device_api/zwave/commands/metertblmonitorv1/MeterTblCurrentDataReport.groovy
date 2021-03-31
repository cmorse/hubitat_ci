package me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterTblCurrentDataReport implements Command
{
    Integer dataset
    Short day
    Short hourLocalTime
    Short minuteLocalTime
    Short month
    Short rateType
    Short reportsToFollow
    Short secondLocalTime
    Integer year
}