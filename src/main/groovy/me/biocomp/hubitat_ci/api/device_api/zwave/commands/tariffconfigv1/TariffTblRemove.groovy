package me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TariffTblRemove implements Command
{
    List rateParameterSetId
    Short rateParameterSetIds
}