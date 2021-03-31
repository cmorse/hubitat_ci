package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1.SceneActuatorConfGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1.SceneActuatorConfReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1.SceneActuatorConfSet

trait SceneActuatorConfV1
{
    abstract SceneActuatorConfGet sceneActuatorConfGet(Map arg0=null)
    abstract SceneActuatorConfReport sceneActuatorConfReport(Map arg0=null)
    abstract SceneActuatorConfSet sceneActuatorConfSet(Map arg0=null)
}
