package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scenecontrollerconfv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SceneControllerConfSet implements Command
{
    Short dimmingDuration
    Short groupId
    Short sceneId
}