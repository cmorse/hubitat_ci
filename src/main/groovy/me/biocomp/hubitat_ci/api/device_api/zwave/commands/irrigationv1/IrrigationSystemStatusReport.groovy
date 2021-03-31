package me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IrrigationSystemStatusReport implements Command
{
    Short flowPrecision
    Short flowScale
    Short flowSize
    List flowValue
    Boolean masterValve
    Short pressurePrecision
    Short pressureScale
    Short pressureSize
    List pressureValue
    BigDecimal scaledFlow
    BigDecimal scaledPressure
    Short sensorStatus
    Short shutoffDuration
    Short systemErrorStatus
    Short systemVoltage
    Short valveID
    static short ERROR_STATUS_EMERGENCY_SHUTDOWN = 1
    static short ERROR_STATUS_HIGH_THRESHOLD_TRIGGERED = 2
    static short ERROR_STATUS_LOW_THRESHOLD_TRIGGERED = 3
    static short ERROR_STATUS_NOT_PROGRAMMED = 0
    static short ERROR_STATUS_VALVE_ERRORS = 4
    static short STATUS_FLOW_SENSOR_DETECTED = 0
    static short STATUS_MOISTURE_SENSOR_DETECTED = 3
    static short STATUS_PRESSURE_SENSOR_DETECTED = 1
    static short STATUS_RAIN_SENSOR_DETECTED = 2
}