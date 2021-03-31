package me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IndicatorGet implements Command
{
    Short indicatorId
}