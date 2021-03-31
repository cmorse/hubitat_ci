package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupCommandListGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupCommandListReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupInfoGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupInfoReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupNameGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupNameReport

trait AssociationGrpInfoV2
{
    abstract AssociationGroupCommandListGet associationGroupCommandListGet(Map arg0=null)
    abstract AssociationGroupCommandListReport associationGroupCommandListReport(Map arg0=null)
    abstract AssociationGroupInfoGet associationGroupInfoGet(Map arg0=null)
    abstract AssociationGroupInfoReport associationGroupInfoReport(Map arg0=null)
    abstract AssociationGroupNameGet associationGroupNameGet(Map arg0=null)
    abstract AssociationGroupNameReport associationGroupNameReport(Map arg0=null)
}
