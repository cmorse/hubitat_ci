package me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TariffTblSet implements Command
{
    Short rateParameterSetId
    Short tariffPrecision
    Integer tariffValue
}