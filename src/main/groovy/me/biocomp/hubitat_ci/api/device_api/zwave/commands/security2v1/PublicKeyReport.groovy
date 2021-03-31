package me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PublicKeyReport implements Command
{
    Boolean includingNode
    List publicKey
}