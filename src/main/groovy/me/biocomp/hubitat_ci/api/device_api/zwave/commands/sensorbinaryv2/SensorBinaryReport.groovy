package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorBinaryReport implements Command
{
    Short sensorType
    Short sensorValue
    static Short SENSOR_TYPE_AUX = 9
    static Short SENSOR_TYPE_CO = 3
    static Short SENSOR_TYPE_CO2 = 4
    static Short SENSOR_TYPE_DOOR_WINDOW = 10
    static Short SENSOR_TYPE_FIRST = 255
    static Short SENSOR_TYPE_FREEZE = 7
    static Short SENSOR_TYPE_GENERAL_PURPOSE = 1
    static Short SENSOR_TYPE_GLASS_BREAK = 13
    static Short SENSOR_TYPE_HEAT = 5
    static Short SENSOR_TYPE_MOTION = 12
    static Short SENSOR_TYPE_SMOKE = 2
    static Short SENSOR_TYPE_TAMPER = 8
    static Short SENSOR_TYPE_TILT = 11
    static Short SENSOR_TYPE_WATER = 6
    static Short SENSOR_VALUE_DETECTED_AN_EVENT = 255
    static Short SENSOR_VALUE_IDLE = 0
}