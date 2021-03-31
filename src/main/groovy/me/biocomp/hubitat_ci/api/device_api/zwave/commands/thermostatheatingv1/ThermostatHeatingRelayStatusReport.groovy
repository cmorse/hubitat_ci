package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatHeatingRelayStatusReport implements Command
{
    Short relayStatus
    static Short RELAY_STATUS_OFF = 0
    static Short RELAY_STATUS_ON = 1
}