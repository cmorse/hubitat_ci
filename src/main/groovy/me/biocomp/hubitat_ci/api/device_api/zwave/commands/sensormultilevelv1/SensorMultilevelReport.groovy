package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorMultilevelReport implements Command
{
    Short precision
    Short scale
    BigDecimal scaledSensorValue
    Short sensorType
    List sensorValue
    Short size
    static Short SENSOR_TYPE_GENERAL_PURPOSE_VALUE_VERSION_1 = 2
    static Short SENSOR_TYPE_LUMINANCE_VERSION_1 = 3
    static Short SENSOR_TYPE_TEMPERATURE_VERSION_1 = 1
}