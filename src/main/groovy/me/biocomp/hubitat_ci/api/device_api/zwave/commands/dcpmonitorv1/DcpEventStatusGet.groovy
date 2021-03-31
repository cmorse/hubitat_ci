package me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DcpEventStatusGet implements Command
{
    Short day
    Short hourLocalTime
    Short minuteLocalTime
    Short month
    Short secondLocalTime
    Integer year
}