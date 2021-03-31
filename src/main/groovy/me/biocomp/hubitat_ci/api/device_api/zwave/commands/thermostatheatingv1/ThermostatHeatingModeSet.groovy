package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatHeatingModeSet implements Command
{
    Short mode
    static Short MODE_ANTI_FREEZE = 3
    static Short MODE_AUTOMATIC = 6
    static Short MODE_MANUAL = 4
    static Short MODE_MANUAL_TIMED = 7
    static Short MODE_OFF = 0
    static Short MODE_OFF_3_HOURS = 2
    static Short MODE_OFF_TIMED = 1
    static Short MODE_TEMPORARY_MANUAL = 5
}