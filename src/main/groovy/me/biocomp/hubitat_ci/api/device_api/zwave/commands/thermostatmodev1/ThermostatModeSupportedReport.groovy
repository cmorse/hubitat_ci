package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatModeSupportedReport implements Command
{
    Boolean auto
    Boolean autoChangeover
    Boolean auxiliaryemergencyHeat
    Boolean cool
    Boolean dryAir
    Boolean fanOnly
    Boolean furnace
    Boolean heat
    Boolean moistAir
    Boolean off
    Boolean resume
}