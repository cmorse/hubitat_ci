package me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RateTblSupportedReport implements Command
{
    Integer parameterSetSupportedBitMask
    Short ratesSupported
}