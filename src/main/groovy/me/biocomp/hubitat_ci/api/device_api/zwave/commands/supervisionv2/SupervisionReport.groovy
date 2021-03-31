package me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SupervisionReport implements Command
{
    Short duration
    Boolean moreStatusUpdates
    Short reserved
    Short sessionID
    Short status
    Boolean wakeUpRequest
    static Short FAIL = 2
    static Short NO_SUPPORT = 0
    static Short SUCCESS = 255
    static Short WORKING = 1
}