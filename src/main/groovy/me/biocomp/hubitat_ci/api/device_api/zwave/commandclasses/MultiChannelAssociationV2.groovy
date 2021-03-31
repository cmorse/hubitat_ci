package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationGroupingsGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationGroupingsReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationSet

trait MultiChannelAssociationV2
{
    abstract MultiChannelAssociationGet multiChannelAssociationGet(Map arg0=null)
    abstract MultiChannelAssociationGroupingsGet multiChannelAssociationGroupingsGet(Map arg0=null)
    abstract MultiChannelAssociationGroupingsReport multiChannelAssociationGroupingsReport(Map arg0=null)
    abstract MultiChannelAssociationRemove multiChannelAssociationRemove(Map arg0=null)
    abstract MultiChannelAssociationReport multiChannelAssociationReport(Map arg0=null)
    abstract MultiChannelAssociationSet multiChannelAssociationSet(Map arg0=null)
}
