package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeSupportedReport

trait ThermostatFanModeV5
{
    abstract ThermostatFanModeGet thermostatFanModeGet(Map arg0=null)
    abstract ThermostatFanModeReport thermostatFanModeReport(Map arg0=null)
    abstract ThermostatFanModeSet thermostatFanModeSet(Map arg0=null)
    abstract ThermostatFanModeSupportedGet thermostatFanModeSupportedGet(Map arg0=null)
    abstract ThermostatFanModeSupportedReport thermostatFanModeSupportedReport(Map arg0=null)
}
