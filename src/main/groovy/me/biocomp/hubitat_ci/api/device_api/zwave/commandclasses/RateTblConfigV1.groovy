package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblconfigv1.RateTblRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblconfigv1.RateTblSet

trait RateTblConfigV1
{
    abstract RateTblRemove rateTblRemove(Map arg0=null)
    abstract RateTblSet rateTblSet(Map arg0=null)
}
