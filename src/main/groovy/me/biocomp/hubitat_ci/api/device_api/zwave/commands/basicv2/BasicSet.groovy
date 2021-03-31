package me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BasicSet implements Command
{
    Short value
}