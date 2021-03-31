package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareUpdateMdStatusReport implements Command
{
    Short status
    static Short INVALID_HARDWARE_VERSION = 4
    static Short STATUS_ANOTHER_TRANSFER_IN_PROGRESS = 5
    static Short STATUS_IINVALID_FRAGMENT_SIZE = 2
    static Short STATUS_INSUFFICIENT_BATTERY_LEVEL = 6
    static Short STATUS_NOT_DOWNLOADABLE = 3
    static Short STATUS_SUCCESSFULLY = 255
    static Short STATUS_UNABLE_TO_RECEIVE = 1
    static Short STATUS_UNABLE_TO_RECEIVE_WITHOUT_CHECKSUM_ERROR = 0
}