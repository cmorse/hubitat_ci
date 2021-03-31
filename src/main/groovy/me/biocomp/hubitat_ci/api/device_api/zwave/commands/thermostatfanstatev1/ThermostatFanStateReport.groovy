package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanstatev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanStateReport implements Command
{
    Short fanOperatingState
    static short FAN_OPERATING_STATE_IDLE_OFF = 0
    static short FAN_OPERATING_STATE_RUNNING = 1
    static short FAN_OPERATING_STATE_RUNNING_HIGH = 2
}