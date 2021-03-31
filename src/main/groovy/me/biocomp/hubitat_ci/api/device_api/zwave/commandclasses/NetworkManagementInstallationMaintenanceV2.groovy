package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.PriorityRouteGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.PriorityRouteReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.PriorityRouteSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.RssiGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.RssiReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.StatisticsClear
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.StatisticsGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.StatisticsReport

trait NetworkManagementInstallationMaintenanceV2
{
    abstract PriorityRouteGet priorityRouteGet(Map arg0=null)
    abstract PriorityRouteReport priorityRouteReport(Map arg0=null)
    abstract PriorityRouteSet priorityRouteSet(Map arg0=null)
    abstract RssiGet rssiGet(Map arg0=null)
    abstract RssiReport rssiReport(Map arg0=null)
    abstract StatisticsClear statisticsClear(Map arg0=null)
    abstract StatisticsGet statisticsGet(Map arg0=null)
    abstract StatisticsReport statisticsReport(Map arg0=null)
}
