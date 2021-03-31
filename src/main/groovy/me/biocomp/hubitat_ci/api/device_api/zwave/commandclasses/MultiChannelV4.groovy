package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelAggregatedMembersGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelAggregatedMembersReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelCapabilityGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelCapabilityReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelCmdEncap
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelEndPointFind
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelEndPointFindReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelEndPointGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelEndPointReport

trait MultiChannelV4
{
    abstract MultiChannelAggregatedMembersGet multiChannelAggregatedMembersGet(Map arg0=null)
    abstract MultiChannelAggregatedMembersReport multiChannelAggregatedMembersReport(Map arg0=null)
    abstract MultiChannelCapabilityGet multiChannelCapabilityGet(Map arg0=null)
    abstract MultiChannelCapabilityReport multiChannelCapabilityReport(Map arg0=null)
    abstract MultiChannelCmdEncap multiChannelCmdEncap(Map arg0=null)
    abstract MultiChannelEndPointFind multiChannelEndPointFind(Map arg0=null)
    abstract MultiChannelEndPointFindReport multiChannelEndPointFindReport(Map arg0=null)
    abstract MultiChannelEndPointGet multiChannelEndPointGet(Map arg0=null)
    abstract MultiChannelEndPointReport multiChannelEndPointReport(Map arg0=null)
}
