package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev1.ThermostatOperatingStateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev1.ThermostatOperatingStateReport

trait ThermostatOperatingStateV1
{
    abstract ThermostatOperatingStateGet thermostatOperatingStateGet(Map arg0=null)
    abstract ThermostatOperatingStateReport thermostatOperatingStateReport(Map arg0=null)
}
