package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanstatev2.ThermostatFanStateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanstatev2.ThermostatFanStateReport

trait ThermostatFanStateV2
{
    abstract ThermostatFanStateGet thermostatFanStateGet(Map arg0=null)
    abstract ThermostatFanStateReport thermostatFanStateReport(Map arg0=null)
}
