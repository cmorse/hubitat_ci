package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv3.SensorMultilevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv3.SensorMultilevelReport

trait SensorMultilevelV3
{
    abstract SensorMultilevelGet sensorMultilevelGet(Map arg0=null)
    abstract SensorMultilevelReport sensorMultilevelReport(Map arg0=null)
}
