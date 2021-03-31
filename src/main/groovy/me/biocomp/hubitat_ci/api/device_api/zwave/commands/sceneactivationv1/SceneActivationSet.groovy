package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactivationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SceneActivationSet implements Command
{
    Short dimmingDuration
    Short sceneId
}