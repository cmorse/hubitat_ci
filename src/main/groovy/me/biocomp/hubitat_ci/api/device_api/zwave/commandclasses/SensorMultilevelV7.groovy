package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelSupportedGetScale
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelSupportedGetSensor
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelSupportedScaleReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelSupportedSensorReport

trait SensorMultilevelV7
{
    abstract SensorMultilevelGet sensorMultilevelGet(Map arg0=null)
    abstract SensorMultilevelReport sensorMultilevelReport(Map arg0=null)
    abstract SensorMultilevelSupportedGetScale sensorMultilevelSupportedGetScale(Map arg0=null)
    abstract SensorMultilevelSupportedGetSensor sensorMultilevelSupportedGetSensor(Map arg0=null)
    abstract SensorMultilevelSupportedScaleReport sensorMultilevelSupportedScaleReport(Map arg0=null)
    abstract SensorMultilevelSupportedSensorReport sensorMultilevelSupportedSensorReport(Map arg0=null)
}
