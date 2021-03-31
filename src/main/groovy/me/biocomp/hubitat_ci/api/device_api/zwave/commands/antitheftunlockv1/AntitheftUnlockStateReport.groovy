package me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftunlockv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AntitheftUnlockStateReport implements Command
{
    List antitheftHint
    Short antitheftHintLength
    Integer manufacturerID
    Boolean restricted
    Boolean state
    Integer zwaveAllianceLockingEntityID
}