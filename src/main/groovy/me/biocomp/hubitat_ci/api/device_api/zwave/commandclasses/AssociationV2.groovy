package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationGroupingsGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationGroupingsReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationSpecificGroupGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationSpecificGroupReport

trait AssociationV2
{
    abstract AssociationGet associationGet(Map arg0=null)
    abstract AssociationGroupingsGet associationGroupingsGet(Map arg0=null)
    abstract AssociationGroupingsReport associationGroupingsReport(Map arg0=null)
    abstract AssociationRemove associationRemove(Map arg0=null)
    abstract AssociationReport associationReport(Map arg0=null)
    abstract AssociationSet associationSet(Map arg0=null)
    abstract AssociationSpecificGroupGet associationSpecificGroupGet(Map arg0=null)
    abstract AssociationSpecificGroupReport associationSpecificGroupReport(Map arg0=null)
}
