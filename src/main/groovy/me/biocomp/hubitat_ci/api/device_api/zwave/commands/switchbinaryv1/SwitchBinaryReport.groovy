package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchBinaryReport implements Command
{
    Short value
}