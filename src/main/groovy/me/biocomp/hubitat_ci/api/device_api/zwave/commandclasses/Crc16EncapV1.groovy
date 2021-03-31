package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.crc16encapv1.Crc16Encap

trait Crc16EncapV1
{
    abstract Crc16Encap crc16Encap(Map arg0=null)
}
