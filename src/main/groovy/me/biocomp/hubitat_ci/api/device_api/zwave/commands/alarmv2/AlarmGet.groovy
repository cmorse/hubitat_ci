package me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AlarmGet implements Command
{
    Short alarmType
    Short zwaveAlarmType
    static Short ZWAVE_ALARM_TYPE_ACCESS_CONTROL = 6
    static Short ZWAVE_ALARM_TYPE_BURGLAR = 7
    static Short ZWAVE_ALARM_TYPE_CLOCK = 11
    static Short ZWAVE_ALARM_TYPE_CO = 2
    static Short ZWAVE_ALARM_TYPE_CO2 = 3
    static Short ZWAVE_ALARM_TYPE_EMERGENCY = 10
    static Short ZWAVE_ALARM_TYPE_FIRST = 255
    static Short ZWAVE_ALARM_TYPE_HEAT = 4
    static Short ZWAVE_ALARM_TYPE_POWER_MANAGEMENT = 8
    static Short ZWAVE_ALARM_TYPE_RESERVED0 = 0
    static Short ZWAVE_ALARM_TYPE_SMOKE = 1
    static Short ZWAVE_ALARM_TYPE_SYSTEM = 9
    static Short ZWAVE_ALARM_TYPE_WATER = 5
}