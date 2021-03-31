package me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IndicatorGet implements Command
{
    Short indicatorId
}