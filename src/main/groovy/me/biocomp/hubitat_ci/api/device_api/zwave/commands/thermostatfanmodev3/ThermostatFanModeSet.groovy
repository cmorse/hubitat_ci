package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanModeSet implements Command
{
    Short fanMode
    Boolean off
    static short FAN_MODE_AUTO_HIGH = 2
    static short FAN_MODE_AUTO_LOW = 0
    static short FAN_MODE_AUTO_MEDIUM = 4
    static short FAN_MODE_CIRCULATION = 6
    static short FAN_MODE_HIGH = 3
    static short FAN_MODE_HUMIDITY = 7
    static short FAN_MODE_LOW = 1
    static short FAN_MODE_MEDIUM = 5
}