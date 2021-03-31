package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1.CtrlReplicationTransferGroup
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1.CtrlReplicationTransferGroupName
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1.CtrlReplicationTransferScene
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1.CtrlReplicationTransferSceneName

trait ControllerReplicationV1
{
    abstract CtrlReplicationTransferGroup ctrlReplicationTransferGroup(Map arg0=null)
    abstract CtrlReplicationTransferGroupName ctrlReplicationTransferGroupName(Map arg0=null)
    abstract CtrlReplicationTransferScene ctrlReplicationTransferScene(Map arg0=null)
    abstract CtrlReplicationTransferSceneName ctrlReplicationTransferSceneName(Map arg0=null)
}
