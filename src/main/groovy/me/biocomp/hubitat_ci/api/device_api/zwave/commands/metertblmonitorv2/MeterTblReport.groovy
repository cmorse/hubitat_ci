package me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterTblReport implements Command
{
    Integer dataHistorySupported
    Integer datasetHistorySupported
    Integer datasetSupported
    Short meterType
    Short payMeter
    Short rateType
    static Short PAY_METER_CREDITMETER = 1
    static Short PAY_METER_PREPAYMENT_METER = 2
    static Short PAY_METER_PREPAYMENT_METER_DEBT = 3
    static Short PAY_METER_RESERVED0 = 0
}