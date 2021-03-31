package me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AntitheftReport implements Command
{
    List antitheftHintByte
    Short antitheftProtectionStatus
    Integer manufacturerID
    Short numberOfAntitheftHintBytes
    Integer zwaveAllianceLockingEntityID
    static short STATUS_DISABLED = 1
    static short STATUS_ENABLED = 2
    static short STATUS_NOT_FULLY_ENABLED = 3
}