package me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ProtectionTimeoutSet implements Command
{
    Short timeout
}