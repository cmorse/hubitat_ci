package me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleOverrideSet implements Command
{
    Short overrideState
    Short overrideType
    static Short OVERRIDE_STATE_NO_OVERRIDE = 0
    static Short OVERRIDE_STATE_PERMANENT_OVERRIDE = 2
    static Short OVERRIDE_STATE_RESERVED3 = 3
    static Short OVERRIDE_STATE_TEMPORARY_OVERRIDE = 1
}