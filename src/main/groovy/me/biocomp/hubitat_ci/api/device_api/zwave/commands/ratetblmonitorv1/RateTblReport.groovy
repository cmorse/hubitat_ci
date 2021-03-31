package me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RateTblReport implements Command
{
    Short consumptionPrecision
    Short consumptionScale
    Short dcpRateId
    Integer durationMinute
    Integer maxConsumptionValue
    Short maxDemandPrecision
    Short maxDemandScale
    Integer maxDemandValue
    Integer minConsumptionValue
    Short numberOfRateChar
    List rateCharacter
    Short rateParameterSetId
    Short rateType
    Short startHourLocalTime
    Short startMinuteLocalTime
}