package me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IrrigationValveConfigReport implements Command
{
    Short flowHighThresholdPrecision
    Short flowHighThresholdScale
    Short flowHighThresholdSize
    List flowHighThresholdValue
    Short flowLowThresholdPrecision
    Short flowLowThresholdScale
    Short flowLowThresholdSize
    List flowLowThresholdValue
    Boolean masterValve
    Short maximumFlowPrecision
    Short maximumFlowScale
    Short maximumFlowSize
    List maximumFlowValue
    Short nominalCurrentHighThreshold
    Short nominalCurrentLowThreshold
    BigDecimal scaledFlowHighThreshold
    BigDecimal scaledFlowLowThreshold
    BigDecimal scaledMaximumFlow
    Short sensorUsage
    Short valveID
    static short SENSOR_USAGE_USE_MOISTURE_SENSOR = 1
    static short SENSOR_USAGE_USE_RAIN_SENSOR = 0
}