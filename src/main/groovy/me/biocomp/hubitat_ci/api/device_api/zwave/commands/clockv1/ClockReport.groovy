package me.biocomp.hubitat_ci.api.device_api.zwave.commands.clockv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ClockReport implements Command
{
    Short hour
    Short minute
    Short weekday
}