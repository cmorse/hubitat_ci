package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeLocationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeLocationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeLocationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeNameGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeNameReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeNameSet

trait NodeNamingV1
{
    abstract NodeNamingNodeLocationGet nodeNamingNodeLocationGet(Map arg0=null)
    abstract NodeNamingNodeLocationReport nodeNamingNodeLocationReport(Map arg0=null)
    abstract NodeNamingNodeLocationSet nodeNamingNodeLocationSet(Map arg0=null)
    abstract NodeNamingNodeNameGet nodeNamingNodeNameGet(Map arg0=null)
    abstract NodeNamingNodeNameReport nodeNamingNodeNameReport(Map arg0=null)
    abstract NodeNamingNodeNameSet nodeNamingNodeNameSet(Map arg0=null)
}
