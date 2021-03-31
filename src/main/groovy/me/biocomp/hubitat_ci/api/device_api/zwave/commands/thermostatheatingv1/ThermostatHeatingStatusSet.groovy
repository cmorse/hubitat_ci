package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatHeatingStatusSet implements Command
{
    Short status
    static Short STATUS_COOLING = 1
    static Short STATUS_HEATING = 0
}