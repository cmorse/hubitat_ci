package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanModeSupportedReport implements Command
{
    Boolean auto
    Boolean autoHigh
    Boolean autoMedium
    Boolean circulation
    Boolean high
    Boolean humidityCirculation
    Boolean low
    Boolean medium
}