package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorAlarmReport implements Command
{
    Integer seconds
    Short sensorState
    Short sensorType
    Short sourceNodeId
}