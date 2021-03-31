package me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TimeReport implements Command
{
    Short hourLocalTime
    Short minuteLocalTime
    Boolean rtcFailure
    Short secondLocalTime
}