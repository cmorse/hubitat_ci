package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeSupportedReport

trait ThermostatModeV1
{
    abstract ThermostatModeGet thermostatModeGet(Map arg0=null)
    abstract ThermostatModeReport thermostatModeReport(Map arg0=null)
    abstract ThermostatModeSet thermostatModeSet(Map arg0=null)
    abstract ThermostatModeSupportedGet thermostatModeSupportedGet(Map arg0=null)
    abstract ThermostatModeSupportedReport thermostatModeSupportedReport(Map arg0=null)
}
