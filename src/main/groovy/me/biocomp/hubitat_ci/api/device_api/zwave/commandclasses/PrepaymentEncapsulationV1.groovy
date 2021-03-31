package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentencapsulationv1.CmdEncapsulation

trait PrepaymentEncapsulationV1
{
    abstract CmdEncapsulation cmdEncapsulation(Map arg0=null)
}
