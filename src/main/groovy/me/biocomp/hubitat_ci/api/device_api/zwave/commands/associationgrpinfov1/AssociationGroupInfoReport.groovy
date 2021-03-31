package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationGroupInfoReport implements Command
{
    Boolean dynamicInfo
    Short groupCount
    List groupInfo
    Boolean listMode
}