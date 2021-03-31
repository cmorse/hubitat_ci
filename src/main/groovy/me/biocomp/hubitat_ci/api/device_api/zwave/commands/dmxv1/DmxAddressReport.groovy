package me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DmxAddressReport implements Command
{
    Short channelId
    Short pageId
}