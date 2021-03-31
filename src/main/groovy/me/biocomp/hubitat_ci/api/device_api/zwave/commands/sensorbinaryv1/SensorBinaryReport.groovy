package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorBinaryReport implements Command
{
    Short sensorValue
    static Short SENSOR_VALUE_DETECTED_AN_EVENT = 255
    static Short SENSOR_VALUE_IDLE = 0
}