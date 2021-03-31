package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatOperatingStateReport implements Command
{
    Short operatingState
    static Short OPERATING_STATE_2ND_STAGE_COOLING = 9
    static Short OPERATING_STATE_2ND_STAGE_HEATING = 8
    static Short OPERATING_STATE_AUX_HEATING = 7
    static Short OPERATING_STATE_COOLING = 2
    static Short OPERATING_STATE_FAN_ONLY = 3
    static Short OPERATING_STATE_HEATING = 1
    static Short OPERATING_STATE_IDLE = 0
    static Short OPERATING_STATE_PENDING_COOL = 5
    static Short OPERATING_STATE_PENDING_HEAT = 4
    static Short OPERATING_STATE_VENT_ECONOMIZER = 6
}