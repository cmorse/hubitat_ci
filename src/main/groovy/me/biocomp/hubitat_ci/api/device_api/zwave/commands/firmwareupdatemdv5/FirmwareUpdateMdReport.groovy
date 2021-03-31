package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdReport implements Command
{
    Integer checksum
    List data
    Boolean last
    Integer reportNumber
}