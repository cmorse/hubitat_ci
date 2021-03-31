package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatFanModeSupportedReport implements Command
{
    Boolean auto
    Boolean autoHigh
    Boolean autoMedium
    Boolean high
    Boolean low
    Boolean medium
}