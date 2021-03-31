package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeSupportedReport

trait ThermostatModeV3
{
    abstract ThermostatModeGet thermostatModeGet(Map arg0=null)
    abstract ThermostatModeReport thermostatModeReport(Map arg0=null)
    abstract ThermostatModeSet thermostatModeSet(Map arg0=null)
    abstract ThermostatModeSupportedGet thermostatModeSupportedGet(Map arg0=null)
    abstract ThermostatModeSupportedReport thermostatModeSupportedReport(Map arg0=null)
}
