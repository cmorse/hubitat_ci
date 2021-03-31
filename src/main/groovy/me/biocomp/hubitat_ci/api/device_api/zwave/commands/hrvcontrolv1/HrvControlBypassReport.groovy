package me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HrvControlBypassReport implements Command
{
    Short bypass
}