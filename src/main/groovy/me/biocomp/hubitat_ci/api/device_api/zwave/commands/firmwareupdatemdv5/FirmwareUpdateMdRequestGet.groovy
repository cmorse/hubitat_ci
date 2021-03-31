package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdRequestGet implements Command
{
    Boolean activation
    Integer checksum
    Integer firmwareId
    Short firmwareTarget
    Integer fragmentSize
    Integer manufacturerId
}