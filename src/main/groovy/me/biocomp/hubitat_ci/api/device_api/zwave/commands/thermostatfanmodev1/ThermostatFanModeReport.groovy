package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanModeReport implements Command
{
    Short fanMode
    static Short FAN_MODE_AUTO_HIGH = 2
    static Short FAN_MODE_AUTO_LOW = 0
    static Short FAN_MODE_HIGH = 3
    static Short FAN_MODE_LOW = 1
}