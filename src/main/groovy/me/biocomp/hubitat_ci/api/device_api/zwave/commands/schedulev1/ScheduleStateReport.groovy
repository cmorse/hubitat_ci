package me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleStateReport implements Command
{
    Short activeId1
    Short activeId2
    Short activeId3
    Short activeIdN
    Short numberOfSupportedScheduleId
    Boolean override
    Short reportsToFollow
}