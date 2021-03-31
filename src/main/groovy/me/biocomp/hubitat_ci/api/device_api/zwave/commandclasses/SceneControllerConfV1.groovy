package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scenecontrollerconfv1.SceneControllerConfGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scenecontrollerconfv1.SceneControllerConfReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.scenecontrollerconfv1.SceneControllerConfSet

trait SceneControllerConfV1
{
    abstract SceneControllerConfGet sceneControllerConfGet(Map arg0=null)
    abstract SceneControllerConfReport sceneControllerConfReport(Map arg0=null)
    abstract SceneControllerConfSet sceneControllerConfSet(Map arg0=null)
}
