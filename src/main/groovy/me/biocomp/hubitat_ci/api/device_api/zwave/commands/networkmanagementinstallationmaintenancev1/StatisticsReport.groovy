package me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait StatisticsReport implements Command
{
    Map neighbors
    Short packetErrorCount
    Short routeChanges
    Short routeNodeId
    Long sumOfTransmissionTimes
    Long sumOfTransmissionTimesSquared
    Short transmissionCount
    static Short SPEED_100 = 4
    static Short SPEED_40 = 2
    static Short SPEED_9 = 1
    static Short STATISTIC_TYPE_NB = 2
    static Short STATISTIC_TYPE_PEC = 3
    static Short STATISTIC_TYPE_RC = 0
    static Short STATISTIC_TYPE_TC = 1
    static Short STATISTIC_TYPE_TS = 4
    static Short STATISTIC_TYPE_TS2 = 5
}