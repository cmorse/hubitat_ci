package me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleSet implements Command
{
    Integer switchpoint0
    Integer switchpoint1
    Integer switchpoint2
    Integer switchpoint3
    Integer switchpoint4
    Integer switchpoint5
    Integer switchpoint6
    Integer switchpoint7
    Integer switchpoint8
    Short weekday
}