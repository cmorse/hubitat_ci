package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatOperatingStateReport implements Command
{
    Short operatingState
    static Short OPERATING_STATE_COOLING = 2
    static Short OPERATING_STATE_FAN_ONLY = 3
    static Short OPERATING_STATE_HEATING = 1
    static Short OPERATING_STATE_IDLE = 0
    static Short OPERATING_STATE_PENDING_COOL = 5
    static Short OPERATING_STATE_PENDING_HEAT = 4
    static Short OPERATING_STATE_VENT_ECONOMIZER = 6
}