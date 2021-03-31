package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationGroupingsGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationGroupingsReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationSpecificGroupGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationSpecificGroupReport

trait AssociationV3
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
