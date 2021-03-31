package me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ConfigurationSet implements Command
{
    Short defaultToneIdentifier
    Short volume
}