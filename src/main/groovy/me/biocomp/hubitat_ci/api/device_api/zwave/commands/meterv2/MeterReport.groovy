package me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterReport implements Command
{
    Integer deltaTime
    Short meterType
    List meterValue
    Short precision
    List previousMeterValue
    Short rateType
    Short scale
    BigDecimal scaledMeterValue
    BigDecimal scaledPreviousMeterValue
    Short size
    static Short METER_TYPE_ELECTRIC_METER = 1
    static Short METER_TYPE_GAS_METER = 2
    static Short METER_TYPE_WATER_METER = 3
}