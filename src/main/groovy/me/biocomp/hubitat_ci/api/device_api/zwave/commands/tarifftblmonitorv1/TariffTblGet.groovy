package me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TariffTblGet implements Command
{
    Short rateParameterSetId
}