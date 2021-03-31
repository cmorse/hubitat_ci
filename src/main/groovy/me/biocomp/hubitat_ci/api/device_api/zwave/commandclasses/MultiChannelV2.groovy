package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelCapabilityGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelCapabilityReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelCmdEncap
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelEndPointFind
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelEndPointFindReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelEndPointGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelEndPointReport

trait MultiChannelV2
{
    abstract MultiChannelCapabilityGet multiChannelCapabilityGet(Map arg0=null)
    abstract MultiChannelCapabilityReport multiChannelCapabilityReport(Map arg0=null)
    abstract MultiChannelCmdEncap multiChannelCmdEncap(Map arg0=null)
    abstract MultiChannelEndPointFind multiChannelEndPointFind(Map arg0=null)
    abstract MultiChannelEndPointFindReport multiChannelEndPointFindReport(Map arg0=null)
    abstract MultiChannelEndPointGet multiChannelEndPointGet(Map arg0=null)
    abstract MultiChannelEndPointReport multiChannelEndPointReport(Map arg0=null)
}
