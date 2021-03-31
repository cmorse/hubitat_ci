package me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AlarmTypeSupportedReport implements Command
{
    Boolean accessControl
    Boolean burglar
    Boolean clock
    Boolean co
    Boolean co2
    Boolean emergency
    Boolean heat
    Short numberOfBitMasks
    Boolean powerManagement
    Boolean smoke
    Boolean system
    Boolean v1Alarm
    Boolean water
}