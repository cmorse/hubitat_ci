package me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CtrlReplicationTransferScene implements Command
{
    Short level
    Short nodeId
    Short sceneId
    Short sequenceNumber
}