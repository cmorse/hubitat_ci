package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchToggleMultilevelStartLevelChange implements Command
{
    Boolean ignoreStartLevel
    Boolean rollOver
    Short startLevel
}