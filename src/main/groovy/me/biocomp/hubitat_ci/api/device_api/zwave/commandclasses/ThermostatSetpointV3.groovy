package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointCapabilitiesGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointCapabilitiesReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointSupportedReport

trait ThermostatSetpointV3
{
    abstract ThermostatSetpointCapabilitiesGet thermostatSetpointCapabilitiesGet(Map arg0=null)
    abstract ThermostatSetpointCapabilitiesReport thermostatSetpointCapabilitiesReport(Map arg0=null)
    abstract ThermostatSetpointGet thermostatSetpointGet(Map arg0=null)
    abstract ThermostatSetpointReport thermostatSetpointReport(Map arg0=null)
    abstract ThermostatSetpointSet thermostatSetpointSet(Map arg0=null)
    abstract ThermostatSetpointSupportedGet thermostatSetpointSupportedGet(Map arg0=null)
    abstract ThermostatSetpointSupportedReport thermostatSetpointSupportedReport(Map arg0=null)
}
