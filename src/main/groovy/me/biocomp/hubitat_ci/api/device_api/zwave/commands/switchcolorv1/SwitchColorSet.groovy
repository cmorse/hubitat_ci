package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchColorSet implements Command
{
    List colorComponentBytes
    short colorComponentCount
    Map colorComponents
}