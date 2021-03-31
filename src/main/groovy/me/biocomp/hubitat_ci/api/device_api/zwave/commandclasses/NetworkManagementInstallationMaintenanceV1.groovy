package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.PriorityRouteGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.PriorityRouteReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.PriorityRouteSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.StatisticsClear
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.StatisticsGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.StatisticsReport

trait NetworkManagementInstallationMaintenanceV1
{
    abstract PriorityRouteGet priorityRouteGet(Map arg0=null)
    abstract PriorityRouteReport priorityRouteReport(Map arg0=null)
    abstract PriorityRouteSet priorityRouteSet(Map arg0=null)
    abstract StatisticsClear statisticsClear(Map arg0=null)
    abstract StatisticsGet statisticsGet(Map arg0=null)
    abstract StatisticsReport statisticsReport(Map arg0=null)
}
