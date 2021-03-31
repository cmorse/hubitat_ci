package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.silencealarmv1.SensorAlarmSet

trait SilenceAlarmV1
{
    abstract SensorAlarmSet sensorAlarmSet(Map arg0=null)
}
