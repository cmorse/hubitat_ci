package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingRelayStatusGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingRelayStatusReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingSetpointGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingSetpointReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingSetpointSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingStatusGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingStatusReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingStatusSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingTimedOffSet

trait ThermostatHeatingV1
{
    abstract ThermostatHeatingModeGet thermostatHeatingModeGet(Map arg0=null)
    abstract ThermostatHeatingModeReport thermostatHeatingModeReport(Map arg0=null)
    abstract ThermostatHeatingModeSet thermostatHeatingModeSet(Map arg0=null)
    abstract ThermostatHeatingRelayStatusGet thermostatHeatingRelayStatusGet(Map arg0=null)
    abstract ThermostatHeatingRelayStatusReport thermostatHeatingRelayStatusReport(Map arg0=null)
    abstract ThermostatHeatingSetpointGet thermostatHeatingSetpointGet(Map arg0=null)
    abstract ThermostatHeatingSetpointReport thermostatHeatingSetpointReport(Map arg0=null)
    abstract ThermostatHeatingSetpointSet thermostatHeatingSetpointSet(Map arg0=null)
    abstract ThermostatHeatingStatusGet thermostatHeatingStatusGet(Map arg0=null)
    abstract ThermostatHeatingStatusReport thermostatHeatingStatusReport(Map arg0=null)
    abstract ThermostatHeatingStatusSet thermostatHeatingStatusSet(Map arg0=null)
    abstract ThermostatHeatingTimedOffSet thermostatHeatingTimedOffSet(Map arg0=null)
}
