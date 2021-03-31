package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdGet implements Command
{
    Short numberOfReports
    Integer reportNumber
}