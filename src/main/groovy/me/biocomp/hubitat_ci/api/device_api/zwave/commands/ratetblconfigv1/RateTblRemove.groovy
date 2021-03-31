package me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblconfigv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RateTblRemove implements Command
{
    List rateParameterSetId
    Short rateParameterSetIds
}