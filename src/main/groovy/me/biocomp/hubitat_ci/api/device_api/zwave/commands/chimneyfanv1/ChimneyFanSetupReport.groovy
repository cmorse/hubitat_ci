package me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ChimneyFanSetupReport implements Command
{
    List alarmTemperatureValue
    Short boostTime
    Short mODE_OFF
    Short mODE_ON
    Short minSpeed
    Short mode
    Short precision1
    Short precision2
    Short precision3
    Short scale1
    Short scale2
    Short scale3
    Short size1
    Short size2
    Short size3
    List startTemperature
    List stopTemperature
    Short stopTime
}