package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationGroupingsGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationGroupingsReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationSet

trait MultiInstanceAssociationV1
{
    abstract MultiInstanceAssociationGet multiInstanceAssociationGet(Map arg0=null)
    abstract MultiInstanceAssociationGroupingsGet multiInstanceAssociationGroupingsGet(Map arg0=null)
    abstract MultiInstanceAssociationGroupingsReport multiInstanceAssociationGroupingsReport(Map arg0=null)
    abstract MultiInstanceAssociationRemove multiInstanceAssociationRemove(Map arg0=null)
    abstract MultiInstanceAssociationReport multiInstanceAssociationReport(Map arg0=null)
    abstract MultiInstanceAssociationSet multiInstanceAssociationSet(Map arg0=null)
}
