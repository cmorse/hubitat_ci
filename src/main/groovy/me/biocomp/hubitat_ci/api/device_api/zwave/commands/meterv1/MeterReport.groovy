package me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterReport implements Command
{
    Short meterType
    List meterValue
    Short precision
    Short scale
    BigDecimal scaledMeterValue
    Short size
    static Short METER_TYPE_ELECTRIC_METER = 1
    static Short METER_TYPE_GAS_METER = 2
    static Short METER_TYPE_WATER_METER = 3
}