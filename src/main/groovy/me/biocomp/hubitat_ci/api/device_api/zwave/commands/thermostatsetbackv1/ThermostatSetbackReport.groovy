package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetbackv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatSetbackReport implements Command
{
    Short setbackState
    Short setbackType
    static Short SETBACK_TYPE_NO_OVERRIDE = 0
    static Short SETBACK_TYPE_PERMANENT_OVERRIDE = 2
    static Short SETBACK_TYPE_RESERVED3 = 3
    static Short SETBACK_TYPE_TEMPORARY_OVERRIDE = 1
}