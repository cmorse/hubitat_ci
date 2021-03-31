package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdReport implements Command
{
    List data
    Boolean last
    Integer reportNumber
}