package me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ChimneyFanAlarmStatusSet implements Command
{
    Boolean acknowledgeAlarmTemperatureExceeded
    Boolean acknowledgeExternalAlarm
    Boolean acknowledgeSensorError
    Boolean notUsed1
    Short notUsed2
}