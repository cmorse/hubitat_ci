package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatSetpointSupportedReport implements Command
{
    Boolean autoChangeover
    List bitmask
    Boolean cooling
    Boolean dryAir
    Boolean furnace
    Boolean heating
    Boolean moistAir
    Boolean none
}