package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetbackv1.ThermostatSetbackGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetbackv1.ThermostatSetbackReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetbackv1.ThermostatSetbackSet

trait ThermostatSetbackV1
{
    abstract ThermostatSetbackGet thermostatSetbackGet(Map arg0=null)
    abstract ThermostatSetbackReport thermostatSetbackReport(Map arg0=null)
    abstract ThermostatSetbackSet thermostatSetbackSet(Map arg0=null)
}
