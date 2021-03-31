package me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterSupportedReport implements Command
{
    Boolean meterReset
    Short meterType
    Short scaleSupported
}