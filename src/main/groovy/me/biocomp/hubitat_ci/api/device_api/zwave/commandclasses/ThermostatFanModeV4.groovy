package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeSupportedReport

trait ThermostatFanModeV4
{
    abstract ThermostatFanModeGet thermostatFanModeGet(Map arg0=null)
    abstract ThermostatFanModeReport thermostatFanModeReport(Map arg0=null)
    abstract ThermostatFanModeSet thermostatFanModeSet(Map arg0=null)
    abstract ThermostatFanModeSupportedGet thermostatFanModeSupportedGet(Map arg0=null)
    abstract ThermostatFanModeSupportedReport thermostatFanModeSupportedReport(Map arg0=null)
}
