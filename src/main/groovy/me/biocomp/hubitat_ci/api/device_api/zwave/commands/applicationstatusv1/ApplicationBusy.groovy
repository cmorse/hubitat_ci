package me.biocomp.hubitat_ci.api.device_api.zwave.commands.applicationstatusv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ApplicationBusy implements Command
{
    Short status
    Short waitTime
    static Short STATUS_REQUEST_QUEUED_EXECUTED_LATER = 2
    static Short STATUS_TRY_AGAIN_IN_WAIT_TIME_SECONDS = 1
    static Short STATUS_TRY_AGAIN_LATER = 0
}