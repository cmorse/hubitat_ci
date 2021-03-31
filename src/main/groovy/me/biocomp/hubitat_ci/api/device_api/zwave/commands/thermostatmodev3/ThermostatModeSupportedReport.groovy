package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatModeSupportedReport implements Command
{
    Boolean auto
    Boolean autoChangeover
    Boolean auxiliaryemergencyHeat
    Boolean away
    Boolean cool
    Boolean dryAir
    Boolean energySaveCool
    Boolean energySaveHeat
    Boolean fanOnly
    Boolean fullPower
    Boolean furnace
    Boolean heat
    Boolean manufacturerSpecific
    Boolean moistAir
    Boolean off
    Boolean resume
}