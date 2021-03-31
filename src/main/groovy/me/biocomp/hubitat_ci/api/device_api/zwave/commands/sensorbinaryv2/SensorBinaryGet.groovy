package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorBinaryGet implements Command
{
    Short sensorType
}