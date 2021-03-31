package me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DmxCapabilityGet implements Command
{
    Short channelId
}