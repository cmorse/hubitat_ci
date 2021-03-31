package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SceneActuatorConfSet implements Command
{
    Short dimmingDuration
    Short level
    Boolean override
    Short sceneId
}