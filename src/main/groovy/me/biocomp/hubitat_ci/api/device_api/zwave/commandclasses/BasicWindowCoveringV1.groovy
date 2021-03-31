package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicwindowcoveringv1.BasicWindowCoveringStartLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicwindowcoveringv1.BasicWindowCoveringStopLevelChange

trait BasicWindowCoveringV1
{
    abstract BasicWindowCoveringStartLevelChange basicWindowCoveringStartLevelChange(Map arg0=null)
    abstract BasicWindowCoveringStopLevelChange basicWindowCoveringStopLevelChange(Map arg0=null)
}
