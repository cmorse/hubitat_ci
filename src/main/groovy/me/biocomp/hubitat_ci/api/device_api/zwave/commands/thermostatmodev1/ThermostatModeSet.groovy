package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatModeSet implements Command
{
    Short mode
    static short MODE_AUTO = 3
    static short MODE_AUTO_CHANGEOVER = 10
    static short MODE_AUXILIARY_HEAT = 4
    static short MODE_COOL = 2
    static short MODE_DRY_AIR = 8
    static short MODE_FAN_ONLY = 6
    static short MODE_FURNACE = 7
    static short MODE_HEAT = 1
    static short MODE_MOIST_AIR = 9
    static short MODE_OFF = 0
    static short MODE_RESUME = 5
}