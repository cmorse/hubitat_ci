package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchMultilevelStartLevelChange implements Command
{
    Short dimmingDuration
    Boolean ignoreStartLevel
    Short incDec
    Short startLevel
    Short stepSize
    Boolean upDown
}