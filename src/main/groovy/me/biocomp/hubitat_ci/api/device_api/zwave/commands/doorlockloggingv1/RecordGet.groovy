package me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RecordGet implements Command
{
    Short recordNumber
}