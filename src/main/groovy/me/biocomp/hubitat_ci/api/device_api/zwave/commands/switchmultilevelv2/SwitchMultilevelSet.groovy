package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchMultilevelSet implements Command
{
    Short dimmingDuration
    Short value
}