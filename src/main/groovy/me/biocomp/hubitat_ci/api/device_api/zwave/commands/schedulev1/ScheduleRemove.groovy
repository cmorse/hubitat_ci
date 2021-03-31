package me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleRemove implements Command
{
    Short scheduleId
}