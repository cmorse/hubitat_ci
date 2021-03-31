package me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ChimneyFanModeSet implements Command
{
    Short mODE_OFF
    Short mODE_ON
    Short mode
}