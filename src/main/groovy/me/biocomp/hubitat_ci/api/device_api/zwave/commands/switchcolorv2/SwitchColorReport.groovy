package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchColorReport implements Command
{
    String colorComponent
    short colorComponentId
    short value
}