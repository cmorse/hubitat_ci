package me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BasicReport implements Command
{
    Short duration
    Short targetValue
    Short value
}