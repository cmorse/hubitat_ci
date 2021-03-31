package me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CentralSceneNotification implements Command
{
    Short keyAttributes
    Short sceneNumber
    Short sequenceNumber
    static Short KEY_HELD_DOWN = 2
    static Short KEY_PRESSED_1_TIME = 0
    static Short KEY_RELEASED = 1
}