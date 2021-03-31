package me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SimpleAvControlSupportedGet implements Command
{
    Short reportNo
}