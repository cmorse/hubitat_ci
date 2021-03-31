package me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait UserCodeGet implements Command
{
    Short userIdentifier
}