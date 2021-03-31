package me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PowerlevelReport implements Command
{
    Short powerLevel
    Short timeout
    static Short POWER_LEVEL_MINUS1DBM = 1
    static Short POWER_LEVEL_MINUS2DBM = 2
    static Short POWER_LEVEL_MINUS3DBM = 3
    static Short POWER_LEVEL_MINUS4DBM = 4
    static Short POWER_LEVEL_MINUS5DBM = 5
    static Short POWER_LEVEL_MINUS6DBM = 6
    static Short POWER_LEVEL_MINUS7DBM = 7
    static Short POWER_LEVEL_MINUS8DBM = 8
    static Short POWER_LEVEL_MINUS9DBM = 9
    static Short POWER_LEVEL_NORMALPOWER = 0
}