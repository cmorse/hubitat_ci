package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockEnableSet implements Command
{
    Short enabled
    Short userIdentifier
}