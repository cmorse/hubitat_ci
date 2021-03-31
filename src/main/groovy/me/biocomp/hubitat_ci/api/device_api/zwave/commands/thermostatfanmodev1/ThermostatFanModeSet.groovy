package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanModeSet implements Command
{
    Short fanMode
    static short FAN_MODE_AUTO_HIGH = 2
    static short FAN_MODE_AUTO_LOW = 0
    static short FAN_MODE_HIGH = 3
    static short FAN_MODE_LOW = 1
}