package me.biocomp.hubitat_ci.api.device_api.zwave.commands.barrieroperatorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BarrierOperatorReport implements Command
{
    Short barrierState
    static Short BARRIER_STATE_CLOSED = 0
    static Short BARRIER_STATE_OPEN = 255
    static Short BARRIER_STATE_UNKNOWN_POSITION_MOVING_TO_CLOSE = 252
    static Short BARRIER_STATE_UNKNOWN_POSITION_MOVING_TO_OPEN = 254
    static Short BARRIER_STATE_UNKNOWN_POSITION_STOPPED = 253
}