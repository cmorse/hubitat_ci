package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2.SensorBinaryGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2.SensorBinaryReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2.SensorBinarySupportedGetSensor
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2.SensorBinarySupportedSensorReport

trait SensorBinaryV2
{
    abstract SensorBinaryGet sensorBinaryGet(Map arg0=null)
    abstract SensorBinaryReport sensorBinaryReport(Map arg0=null)
    abstract SensorBinarySupportedGetSensor sensorBinarySupportedGetSensor(Map arg0=null)
    abstract SensorBinarySupportedSensorReport sensorBinarySupportedSensorReport(Map arg0=null)
}
