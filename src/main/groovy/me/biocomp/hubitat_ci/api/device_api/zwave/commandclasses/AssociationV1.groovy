package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationGroupingsGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationGroupingsReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationSet

trait AssociationV1
{
    abstract AssociationGet associationGet(Map arg0=null)
    abstract AssociationGroupingsGet associationGroupingsGet(Map arg0=null)
    abstract AssociationGroupingsReport associationGroupingsReport(Map arg0=null)
    abstract AssociationRemove associationRemove(Map arg0=null)
    abstract AssociationReport associationReport(Map arg0=null)
    abstract AssociationSet associationSet(Map arg0=null)
}
