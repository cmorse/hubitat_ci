package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchBinarySet implements Command
{
    Short switchValue
}