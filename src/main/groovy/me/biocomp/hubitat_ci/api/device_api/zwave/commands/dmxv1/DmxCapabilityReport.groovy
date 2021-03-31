package me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DmxCapabilityReport implements Command
{
    Short channelId
    Short deviceChannels
    Short maxChannels
    Integer propertyId
}