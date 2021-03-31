package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglebinaryv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchToggleBinaryReport implements Command
{
    Short value
}