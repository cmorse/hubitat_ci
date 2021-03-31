package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanModeReport implements Command
{
    Short fanMode
    Boolean off
    static Short FAN_MODE_AUTO_HIGH = 2
    static Short FAN_MODE_AUTO_LOW = 0
    static Short FAN_MODE_AUTO_MEDIUM = 4
    static Short FAN_MODE_HIGH = 3
    static Short FAN_MODE_LOW = 1
    static Short FAN_MODE_MEDIUM = 5
}