package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeSupportedReport

trait ThermostatFanModeV3
{
    abstract ThermostatFanModeGet thermostatFanModeGet(Map arg0=null)
    abstract ThermostatFanModeReport thermostatFanModeReport(Map arg0=null)
    abstract ThermostatFanModeSet thermostatFanModeSet(Map arg0=null)
    abstract ThermostatFanModeSupportedGet thermostatFanModeSupportedGet(Map arg0=null)
    abstract ThermostatFanModeSupportedReport thermostatFanModeSupportedReport(Map arg0=null)
}
