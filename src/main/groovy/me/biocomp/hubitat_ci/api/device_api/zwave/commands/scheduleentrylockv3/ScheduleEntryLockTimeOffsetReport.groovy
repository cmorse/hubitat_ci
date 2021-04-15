package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockTimeOffsetReport implements Command
{
    Short hourTzo
    Short minuteOffsetDst
    Short minuteTzo
    Short signOffsetDst
    Short signTzo
}