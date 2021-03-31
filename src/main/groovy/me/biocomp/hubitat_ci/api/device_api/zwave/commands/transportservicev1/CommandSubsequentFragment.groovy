package me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandSubsequentFragment implements Command
{
    Integer checksum
    Short datagramOffset1
    Short datagramOffset2
    Short datagramSize1
    Short datagramSize2
    Short sequenceNo
}