package me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait Security2TransferEnd implements Command
{
    Boolean keyVerified
    Boolean requestComplete
}