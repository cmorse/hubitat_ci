package me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ChimneyFanAlarmStatusReport implements Command
{
    Boolean alarmTemperatureExceeded
    Boolean externalAlarm
    Short notUsed
    Boolean sensorError
    Boolean service
    Boolean speedChangeEnable
    Boolean startTemperatureExceeded
}