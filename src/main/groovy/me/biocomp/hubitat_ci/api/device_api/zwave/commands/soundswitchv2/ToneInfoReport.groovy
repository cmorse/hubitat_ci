package me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ToneInfoReport implements Command
{
    Short nameLength
    Integer toneDuration
    Short toneIdentifier
    String toneName
}