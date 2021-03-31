package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SceneActuatorConfReport implements Command
{
    Short dimmingDuration
    Short level
    Short sceneId
}