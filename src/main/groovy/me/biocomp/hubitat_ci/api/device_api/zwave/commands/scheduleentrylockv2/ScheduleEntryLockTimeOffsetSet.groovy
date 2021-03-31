package me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleEntryLockTimeOffsetSet implements Command
{
    Short hourTzo
    Short minuteOffsetDst
    Short minuteTzo
    Short signOffsetDst
    Short signTzo
}