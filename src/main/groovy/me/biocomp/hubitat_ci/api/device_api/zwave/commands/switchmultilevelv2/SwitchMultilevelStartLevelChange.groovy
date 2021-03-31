package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchMultilevelStartLevelChange implements Command
{
    Short dimmingDuration
    Boolean ignoreStartLevel
    Short startLevel
    Boolean upDown
}