package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanModeSupportedReport implements Command
{
    Boolean auto
    Boolean autoHigh
    Boolean autoMedium
    Boolean circulation
    Boolean externalCirculation
    Boolean high
    Boolean humidityCirculation
    Boolean leftRight
    Boolean low
    Boolean medium
    Boolean quiet
    Boolean upDown
}