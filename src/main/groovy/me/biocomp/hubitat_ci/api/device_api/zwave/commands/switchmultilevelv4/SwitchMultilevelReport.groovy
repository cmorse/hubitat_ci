package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchMultilevelReport implements Command
{
    Short duration
    Short targetValue
    Short value
}