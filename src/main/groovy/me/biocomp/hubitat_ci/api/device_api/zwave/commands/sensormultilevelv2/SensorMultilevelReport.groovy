package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorMultilevelReport implements Command
{
    Short precision
    Short scale
    BigDecimal scaledSensorValue
    Short sensorType
    List sensorValue
    Short size
    static Short SENSOR_TYPE_ATMOSPHERIC_PRESSURE_VERSION_2 = 8
    static Short SENSOR_TYPE_BAROMETRIC_PRESSURE_VERSION_2 = 9
    static Short SENSOR_TYPE_DEW_POINT_VERSION_2 = 11
    static Short SENSOR_TYPE_DIRECTION_VERSION_2 = 7
    static Short SENSOR_TYPE_GENERAL_PURPOSE_VALUE_VERSION_1 = 2
    static Short SENSOR_TYPE_LUMINANCE_VERSION_1 = 3
    static Short SENSOR_TYPE_POWER_VERSION_2 = 4
    static Short SENSOR_TYPE_RAIN_RATE_VERSION_2 = 12
    static Short SENSOR_TYPE_RELATIVE_HUMIDITY_VERSION_2 = 5
    static Short SENSOR_TYPE_SOLAR_RADIATION_VERSION_2 = 10
    static Short SENSOR_TYPE_TEMPERATURE_VERSION_1 = 1
    static Short SENSOR_TYPE_TIDE_LEVEL_VERSION_2 = 13
    static Short SENSOR_TYPE_VELOCITY_VERSION_2 = 6
}