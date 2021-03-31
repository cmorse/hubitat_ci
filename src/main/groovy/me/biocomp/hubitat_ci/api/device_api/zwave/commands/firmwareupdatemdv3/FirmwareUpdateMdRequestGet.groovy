package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdRequestGet implements Command
{
    Integer checksum
    Integer firmwareId
    Short firmwareTarget
    Integer fragmentSize
    Integer manufacturerId
}