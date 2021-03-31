package me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ProtectionTimeoutReport implements Command
{
    Short timeout
}