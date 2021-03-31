package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorAlarmSupportedReport implements Command
{
    List bitMask
    Short numberOfBitMasks
}