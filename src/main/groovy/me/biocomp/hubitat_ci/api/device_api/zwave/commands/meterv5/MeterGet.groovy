package me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv5

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterGet implements Command
{
    Short rateType
    Short scale
    Short scale2
}