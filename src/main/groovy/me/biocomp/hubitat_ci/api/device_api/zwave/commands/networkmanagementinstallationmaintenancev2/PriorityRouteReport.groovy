package me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PriorityRouteReport implements Command
{
    Short repeater1
    Short repeater2
    Short repeater3
    Short repeater4
    Short routeNodeId
    Short routeType
    Short speed
    static Short SPEED_100 = 3
    static Short SPEED_40 = 2
    static Short SPEED_9 = 1
    static Short ZW_PRIORITY_ROUTE_APP_PR = 16
    static Short ZW_PRIORITY_ROUTE_ZW_LWR = 1
    static Short ZW_PRIORITY_ROUTE_ZW_NLWR = 2
}