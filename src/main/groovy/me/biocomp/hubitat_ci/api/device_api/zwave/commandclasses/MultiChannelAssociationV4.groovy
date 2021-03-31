package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationGroupingsGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationGroupingsReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationSet

trait MultiChannelAssociationV4
{
    abstract MultiChannelAssociationGet multiChannelAssociationGet(Map arg0=null)
    abstract MultiChannelAssociationGroupingsGet multiChannelAssociationGroupingsGet(Map arg0=null)
    abstract MultiChannelAssociationGroupingsReport multiChannelAssociationGroupingsReport(Map arg0=null)
    abstract MultiChannelAssociationRemove multiChannelAssociationRemove(Map arg0=null)
    abstract MultiChannelAssociationReport multiChannelAssociationReport(Map arg0=null)
    abstract MultiChannelAssociationSet multiChannelAssociationSet(Map arg0=null)
}
