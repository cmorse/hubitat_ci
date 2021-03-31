package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelTestNodeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelTestNodeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelTestNodeSet

trait PowerlevelV1
{
    abstract PowerlevelGet powerlevelGet(Map arg0=null)
    abstract PowerlevelReport powerlevelReport(Map arg0=null)
    abstract PowerlevelSet powerlevelSet(Map arg0=null)
    abstract PowerlevelTestNodeGet powerlevelTestNodeGet(Map arg0=null)
    abstract PowerlevelTestNodeReport powerlevelTestNodeReport(Map arg0=null)
    abstract PowerlevelTestNodeSet powerlevelTestNodeSet(Map arg0=null)
}
