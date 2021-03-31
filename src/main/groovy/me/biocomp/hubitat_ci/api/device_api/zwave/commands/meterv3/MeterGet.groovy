package me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterGet implements Command
{
    Short scale
}