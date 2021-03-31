package me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DateReport implements Command
{
    Short day
    Short month
    Integer year
}