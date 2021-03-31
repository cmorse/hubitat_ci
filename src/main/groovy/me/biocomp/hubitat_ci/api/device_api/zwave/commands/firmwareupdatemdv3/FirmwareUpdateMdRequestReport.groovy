package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdRequestReport implements Command
{
    Short status
    static Short STATUS_IINVALID_FRAGMENT_SIZE = 2
    static Short STATUS_INVALID_COMBINATION = 0
    static Short STATUS_NOT_DOWNLOADABLE = 3
    static Short STATUS_REQUIRES_AUTHENTICATION = 1
    static Short STATUS_VALID_COMBINATION = 255
}