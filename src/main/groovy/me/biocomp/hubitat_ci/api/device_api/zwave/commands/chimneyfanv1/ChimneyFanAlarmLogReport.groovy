package me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ChimneyFanAlarmLogReport implements Command
{
    Boolean alarmStillActive1
    Boolean alarmStillActive2
    Boolean alarmStillActive3
    Boolean alarmStillActive4
    Boolean alarmStillActive5
    Boolean alarmTemperatureExceeded1
    Boolean alarmTemperatureExceeded2
    Boolean alarmTemperatureExceeded3
    Boolean alarmTemperatureExceeded4
    Boolean alarmTemperatureExceeded5
    Boolean externalAlarm1
    Boolean externalAlarm2
    Boolean externalAlarm3
    Boolean externalAlarm4
    Boolean externalAlarm5
    Boolean sensorError1
    Boolean sensorError2
    Boolean sensorError3
    Boolean sensorError4
    Boolean sensorError5
}