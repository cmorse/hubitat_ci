package me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicwindowcoveringv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BasicWindowCoveringStartLevelChange implements Command
{
    Boolean openClose
}