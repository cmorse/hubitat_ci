package me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AntitheftSet implements Command
{
    List antitheftHintByte
    Short enable
    List magicCode
    Integer manufacturerID
    Short numberOfAntitheftHintBytes
    Short numberOfMagicCodeBytes
    Integer zwaveAllianceLockingEntityID
}