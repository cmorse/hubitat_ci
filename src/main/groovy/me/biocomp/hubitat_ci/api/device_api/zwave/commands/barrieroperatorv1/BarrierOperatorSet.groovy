package me.biocomp.hubitat_ci.api.device_api.zwave.commands.barrieroperatorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BarrierOperatorSet implements Command
{
    Short requestedBarrierState
    static Short REQUESTED_BARRIER_STATE_CLOSE = 0
    static Short REQUESTED_BARRIER_STATE_OPEN = 255
}