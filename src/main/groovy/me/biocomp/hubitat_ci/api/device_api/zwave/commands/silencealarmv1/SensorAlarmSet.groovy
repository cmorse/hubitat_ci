package me.biocomp.hubitat_ci.api.device_api.zwave.commands.silencealarmv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorAlarmSet implements Command
{
    List bitMask
    Short mode
    Short numberOfBitMasks
    Integer seconds
}