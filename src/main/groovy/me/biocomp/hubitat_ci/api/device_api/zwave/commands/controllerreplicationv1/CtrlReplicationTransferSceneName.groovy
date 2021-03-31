package me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CtrlReplicationTransferSceneName implements Command
{
    Short sceneId
    List sceneName
    Short sequenceNumber
}