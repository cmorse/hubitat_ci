package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SceneActuatorConfGet implements Command
{
    Short sceneId
}