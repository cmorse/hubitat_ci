package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanModeSupportedReport implements Command
{
    Boolean auto
    Boolean autoHigh
    Boolean high
    Boolean low
}