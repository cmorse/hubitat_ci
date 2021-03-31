package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatSetpointSupportedReport implements Command
{
    Boolean autoChangeover
    Boolean awayCooling
    Boolean awayHeating
    List bitmask
    Boolean cooling
    Boolean dryAir
    Boolean energySaveCooling
    Boolean energySaveHeating
    Boolean fullPower
    Boolean furnace
    Boolean heating
    Boolean moistAir
    Boolean none
}