package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactivationv1.SceneActivationSet

trait SceneActivationV1
{
    abstract SceneActivationSet sceneActivationSet(Map arg0=null)
}
