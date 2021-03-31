package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelSupportedGetScale
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelSupportedGetSensor
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelSupportedScaleReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelSupportedSensorReport

trait SensorMultilevelV5
{
    abstract SensorMultilevelGet sensorMultilevelGet(Map arg0=null)
    abstract SensorMultilevelReport sensorMultilevelReport(Map arg0=null)
    abstract SensorMultilevelSupportedGetScale sensorMultilevelSupportedGetScale(Map arg0=null)
    abstract SensorMultilevelSupportedGetSensor sensorMultilevelSupportedGetSensor(Map arg0=null)
    abstract SensorMultilevelSupportedScaleReport sensorMultilevelSupportedScaleReport(Map arg0=null)
    abstract SensorMultilevelSupportedSensorReport sensorMultilevelSupportedSensorReport(Map arg0=null)
}
