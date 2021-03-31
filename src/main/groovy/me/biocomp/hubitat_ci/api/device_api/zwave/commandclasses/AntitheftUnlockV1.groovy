package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftunlockv1.AntitheftUnlockSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftunlockv1.AntitheftUnlockStateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftunlockv1.AntitheftUnlockStateReport

trait AntitheftUnlockV1
{
    abstract AntitheftUnlockSet antitheftUnlockSet(Map arg0=null)
    abstract AntitheftUnlockStateGet antitheftUnlockStateGet(Map arg0=null)
    abstract AntitheftUnlockStateReport antitheftUnlockStateReport(Map arg0=null)
}
