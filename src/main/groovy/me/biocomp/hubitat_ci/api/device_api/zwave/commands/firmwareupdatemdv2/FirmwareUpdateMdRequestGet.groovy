package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdRequestGet implements Command
{
    Integer checksum
    Integer firmwareId
    Integer manufacturerId
}