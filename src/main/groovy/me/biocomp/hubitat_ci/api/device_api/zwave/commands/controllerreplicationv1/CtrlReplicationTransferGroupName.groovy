package me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CtrlReplicationTransferGroupName implements Command
{
    Short groupId
    List groupName
    Short sequenceNumber
}