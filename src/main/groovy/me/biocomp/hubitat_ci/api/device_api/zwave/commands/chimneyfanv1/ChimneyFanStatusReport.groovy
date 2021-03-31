package me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ChimneyFanStatusReport implements Command
{
    Boolean alarmTemperatureExceeded
    Boolean externalAlarm
    Short notUsed
    Short precision
    Short sTATE_BOOST
    Short sTATE_CHIMNEY_FIRE
    Short sTATE_EXHAUST
    Short sTATE_EXTERNAL_ALARM
    Short sTATE_OFF
    Short sTATE_RELOAD
    Short sTATE_SENSOR_FAILURE
    Short sTATE_SERVICE
    Short sTATE_STOP
    Short sTATE_VENTING
    Short sTATE_VENTING_EX
    Short scale
    BigDecimal scaledValue
    Boolean sensorError
    Boolean service
    Short size
    Short speed
    Boolean speedChangeEnable
    Boolean startTemperatureExceeded
    Short state
    List value
}