package me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DcpListRemove implements Command
{
    Short day
    Short hourLocalTime
    Short minuteLocalTime
    Short month
    Short secondLocalTime
    Integer year
}