package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatModeSet implements Command
{
    List manufacturerData
    Short mode
    Short noOfManufacturerDataFields
    static short MODE_AUTO = 3
    static short MODE_AUTO_CHANGEOVER = 10
    static short MODE_AUXILIARY_HEAT = 4
    static short MODE_AWAY = 13
    static short MODE_COOL = 2
    static short MODE_DRY_AIR = 8
    static short MODE_ENERGY_SAVE_COOL = 12
    static short MODE_ENERGY_SAVE_HEAT = 11
    static short MODE_FAN_ONLY = 6
    static short MODE_FULL_POWER = 15
    static short MODE_FURNACE = 7
    static short MODE_HEAT = 1
    static short MODE_MANUFACTURER_SPECIFIC = 31
    static short MODE_MOIST_AIR = 9
    static short MODE_OFF = 0
    static short MODE_RESUME = 5
}