package me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CentralSceneNotification implements Command
{
    Short keyAttributes
    Short sceneNumber
    Short sequenceNumber
    static Short KEY_HELD_DOWN = 2
    static Short KEY_PRESSED_1_TIME = 0
    static Short KEY_PRESSED_2_TIMES = 3
    static Short KEY_PRESSED_3_TIMES = 4
    static Short KEY_PRESSED_4_TIMES = 5
    static Short KEY_PRESSED_5_TIMES = 6
    static Short KEY_RELEASED = 1
}