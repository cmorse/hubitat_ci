package me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv5

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterSupportedReport implements Command
{
    Boolean meterReset
    Short meterType
    Boolean moreScaleTypes
    Short rateType
    Short scaleSupported
    List scaleSupportedBytes
}