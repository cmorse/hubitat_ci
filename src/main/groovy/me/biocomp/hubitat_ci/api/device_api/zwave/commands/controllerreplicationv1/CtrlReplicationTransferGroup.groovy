package me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CtrlReplicationTransferGroup implements Command
{
    Short groupId
    Short nodeId
    Short sequenceNumber
}