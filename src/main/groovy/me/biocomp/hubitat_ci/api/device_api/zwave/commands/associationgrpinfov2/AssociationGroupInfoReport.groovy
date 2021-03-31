package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGroupInfoReport implements Command
{
    Boolean dynamicInfo
    Short groupCount
    List groupInfo
    Boolean listMode
}