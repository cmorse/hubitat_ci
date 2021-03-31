package me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IrrigationSystemConfigSet implements Command
{
    Short highPressureThresholdPrecision
    Short highPressureThresholdScale
    Short highPressureThresholdSize
    List highPressureThresholdValue
    Short lowPressureThresholdPrecision
    Short lowPressureThresholdScale
    Short lowPressureThresholdSize
    List lowPressureThresholdValue
    Short masterValveDelay
    BigDecimal scaledHighPressureThreshold
    BigDecimal scaledLowPressureThresholdPressure
    Short sensorPolarity
    static short SENSOR_POLARITY_MOISTURE_SENSOR_POLARITY = 1
    static short SENSOR_POLARITY_RAIN_SENSOR_POLARITY = 0
    static short SENSOR_POLARITY_VALID = 7
}