package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorconfigurationv1.SensorTriggerLevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorconfigurationv1.SensorTriggerLevelReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorconfigurationv1.SensorTriggerLevelSet

trait SensorConfigurationV1
{
    abstract SensorTriggerLevelGet sensorTriggerLevelGet(Map arg0=null)
    abstract SensorTriggerLevelReport sensorTriggerLevelReport(Map arg0=null)
    abstract SensorTriggerLevelSet sensorTriggerLevelSet(Map arg0=null)
}
