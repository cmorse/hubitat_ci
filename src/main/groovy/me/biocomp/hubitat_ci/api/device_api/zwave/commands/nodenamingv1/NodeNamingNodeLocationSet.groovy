package me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait NodeNamingNodeLocationSet implements Command
{
    Short charPresentation
    List nodeLocation
}