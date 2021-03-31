package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchColorStartLevelChange implements Command
{
    short colorComponentId
    short dimmingDuration
    boolean ignoreStartLevel
    short startLevel
    boolean upDown
    boolean isIgnoreStartLevel() { return ignoreStartLevel }
    boolean isUpDown() { return upDown }
}