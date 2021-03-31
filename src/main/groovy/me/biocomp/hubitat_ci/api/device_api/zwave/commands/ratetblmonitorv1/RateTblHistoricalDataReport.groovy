package me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RateTblHistoricalDataReport implements Command
{
    Integer dataset
    Short day
    Short hourLocalTime
    Short minuteLocalTime
    Short month
    Short rateParameterSetId
    Short reportsToFollow
    Short secondLocalTime
    Integer year
}