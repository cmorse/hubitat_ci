package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv4.SensorMultilevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv4.SensorMultilevelReport

trait SensorMultilevelV4
{
    abstract SensorMultilevelGet sensorMultilevelGet(Map arg0=null)
    abstract SensorMultilevelReport sensorMultilevelReport(Map arg0=null)
}
