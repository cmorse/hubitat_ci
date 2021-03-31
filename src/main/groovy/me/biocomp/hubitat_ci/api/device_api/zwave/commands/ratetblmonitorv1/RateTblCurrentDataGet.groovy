package me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RateTblCurrentDataGet implements Command
{
    Integer datasetRequested
    Short rateParameterSetId
}