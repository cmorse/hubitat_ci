package me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DmxData implements Command
{
    List dmxChannel
    Short page
    Short sequenceNo
    Short source
}