package me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TonePlaySet implements Command
{
    Short toneIdentifier
    Short volume
}