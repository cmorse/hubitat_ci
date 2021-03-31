package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupCommandListGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupCommandListReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupInfoGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupInfoReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupNameGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupNameReport

trait AssociationGrpInfoV1
{
    abstract AssociationGroupCommandListGet associationGroupCommandListGet(Map arg0=null)
    abstract AssociationGroupCommandListReport associationGroupCommandListReport(Map arg0=null)
    abstract AssociationGroupInfoGet associationGroupInfoGet(Map arg0=null)
    abstract AssociationGroupInfoReport associationGroupInfoReport(Map arg0=null)
    abstract AssociationGroupNameGet associationGroupNameGet(Map arg0=null)
    abstract AssociationGroupNameReport associationGroupNameReport(Map arg0=null)
}
