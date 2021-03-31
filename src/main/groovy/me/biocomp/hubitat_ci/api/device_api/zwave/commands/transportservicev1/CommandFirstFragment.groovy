package me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandFirstFragment implements Command
{
    Integer checksum
    Short datagramSize1
    Short datagramSize2
    Short sequenceNo
}