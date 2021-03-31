package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointSupportedReport

trait ThermostatSetpointV2
{
    abstract ThermostatSetpointGet thermostatSetpointGet(Map arg0=null)
    abstract ThermostatSetpointReport thermostatSetpointReport(Map arg0=null)
    abstract ThermostatSetpointSet thermostatSetpointSet(Map arg0=null)
    abstract ThermostatSetpointSupportedGet thermostatSetpointSupportedGet(Map arg0=null)
    abstract ThermostatSetpointSupportedReport thermostatSetpointSupportedReport(Map arg0=null)
}
