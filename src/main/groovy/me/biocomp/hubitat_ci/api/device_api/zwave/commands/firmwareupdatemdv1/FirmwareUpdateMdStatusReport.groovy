package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdStatusReport implements Command
{
    Short status
    static Short STATUS_SUCCESSFULLY = 255
    static Short STATUS_UNABLE_TO_RECEIVE = 1
    static Short STATUS_UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR = 0
}