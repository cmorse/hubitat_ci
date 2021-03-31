package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstancev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiInstanceGet implements Command
{
    Short commandClass
}