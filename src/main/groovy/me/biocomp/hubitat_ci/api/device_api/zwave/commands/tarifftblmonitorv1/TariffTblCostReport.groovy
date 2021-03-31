package me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TariffTblCostReport implements Command
{
    Short costPrecision
    Integer costValue
    Integer currency
    Short rateParameterSetId
    Short rateType
    Short startDay
    Short startHourLocalTime
    Short startMinuteLocalTime
    Short startMonth
    Integer startYear
    Short stopDay
    Short stopHourLocalTime
    Short stopMinuteLocalTime
    Short stopMonth
    Integer stopYear
}