package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatHeatingSetpointReport implements Command
{
    Short precision
    Short scale
    BigDecimal scaledValue
    Short setpointNr
    Short size
    List value
}