package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv1.SensorBinaryGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv1.SensorBinaryReport

trait SensorBinaryV1
{
    abstract SensorBinaryGet sensorBinaryGet(Map arg0=null)
    abstract SensorBinaryReport sensorBinaryReport(Map arg0=null)
}
