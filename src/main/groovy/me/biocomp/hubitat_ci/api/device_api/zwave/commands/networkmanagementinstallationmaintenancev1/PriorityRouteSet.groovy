package me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PriorityRouteSet implements Command
{
    Short repeater1
    Short repeater2
    Short repeater3
    Short repeater4
    Short routeNodeId
    Short speed
    static Short SPEED_100 = 3
    static Short SPEED_40 = 2
    static Short SPEED_9 = 1
}