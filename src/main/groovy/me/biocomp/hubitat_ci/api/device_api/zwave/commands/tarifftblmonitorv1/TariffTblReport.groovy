package me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TariffTblReport implements Command
{
    Short rateParameterSetId
    Short tariffPrecision
    Integer tariffValue
}