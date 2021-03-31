package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanstatev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanStateReport implements Command
{
    Short fanOperatingState
    static short FAN_OPERATING_STATE_CIRCULATION_MODE = 4
    static short FAN_OPERATING_STATE_HUMIDITY_CIRCULATION_MODE = 5
    static short FAN_OPERATING_STATE_IDLE_OFF = 0
    static short FAN_OPERATING_STATE_QUIET_CIRCULATION_MODE = 8
    static short FAN_OPERATING_STATE_RIGHT_LEFT_CIRCULATION_MODE = 6
    static short FAN_OPERATING_STATE_RUNNING = 1
    static short FAN_OPERATING_STATE_RUNNING_HIGH = 2
    static short FAN_OPERATING_STATE_RUNNING_MEDIUM = 3
    static short FAN_OPERATING_STATE_UP_DOWN_CIRCULATION_MODE = 7
}