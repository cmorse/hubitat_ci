package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchColorStopLevelChange implements Command
{
    short colorComponentId
}