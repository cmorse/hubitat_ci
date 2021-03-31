package me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PriorityRouteGet implements Command
{
    Short routeNodeId
}