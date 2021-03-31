package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scenecontrollerconfv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SceneControllerConfGet implements Command
{
    Short groupId
}