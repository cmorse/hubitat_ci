package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdReport implements Command
{
    Integer checksum
    List data
    Boolean last
    Integer reportNumber
}