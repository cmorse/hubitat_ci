package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hailv1.Hail

trait HailV1
{
    abstract Hail hail(Map arg0=null)
}
