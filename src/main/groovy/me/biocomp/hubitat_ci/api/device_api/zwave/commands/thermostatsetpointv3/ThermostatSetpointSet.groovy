package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatSetpointSet implements Command
{
    Short precision
    Short scale
    BigDecimal scaledValue
    Short setpointType
    Short size
    List value
    static short SETPOINT_TYPE_AUTO_CHANGEOVER = 10
    static short SETPOINT_TYPE_AWAY_COOLING = 14
    static short SETPOINT_TYPE_AWAY_HEATING = 13
    static short SETPOINT_TYPE_COOLING_1 = 2
    static short SETPOINT_TYPE_DRY_AIR = 8
    static short SETPOINT_TYPE_ENERGY_SAVE_COOLING = 12
    static short SETPOINT_TYPE_ENERGY_SAVE_HEATING = 11
    static short SETPOINT_TYPE_FULL_POWER = 15
    static short SETPOINT_TYPE_FURNACE = 7
    static short SETPOINT_TYPE_HEATING_1 = 1
    static short SETPOINT_TYPE_MOIST_AIR = 9
    static short SETPOINT_TYPE_NOT_SUPPORTED = 0
    static short SETPOINT_TYPE_NOT_SUPPORTED1 = 3
    static short SETPOINT_TYPE_NOT_SUPPORTED2 = 4
    static short SETPOINT_TYPE_NOT_SUPPORTED3 = 5
    static short SETPOINT_TYPE_NOT_SUPPORTED4 = 6
}