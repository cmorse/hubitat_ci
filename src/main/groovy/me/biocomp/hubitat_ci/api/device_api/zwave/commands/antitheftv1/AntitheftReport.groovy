package me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AntitheftReport implements Command
{
    List antitheftHintByte
    Short antitheftProtectionStatus
    Integer manufacturerID
    Short numberOfAntitheftHintBytes
}