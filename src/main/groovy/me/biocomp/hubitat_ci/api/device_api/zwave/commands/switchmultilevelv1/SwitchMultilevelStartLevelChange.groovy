package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchMultilevelStartLevelChange implements Command
{
    Boolean ignoreStartLevel
    Short startLevel
    Boolean upDown
}