package me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleChangedReport implements Command
{
    Short changecounter
}