package me.biocomp.hubitat_ci.api.device_api.zwave.commands.crc16encapv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait Crc16Encap implements Command
{
    Integer checksum
    Short command
    Short commandClass
    List data
}