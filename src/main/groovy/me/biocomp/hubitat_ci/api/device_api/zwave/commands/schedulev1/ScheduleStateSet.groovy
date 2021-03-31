package me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleStateSet implements Command
{
    Short scheduleId
    Short scheduleState
}