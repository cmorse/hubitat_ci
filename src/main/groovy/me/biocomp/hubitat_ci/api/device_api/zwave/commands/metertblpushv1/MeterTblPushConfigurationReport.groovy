package me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblpushv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterTblPushConfigurationReport implements Command
{
    Short intervalDays
    Short intervalHours
    Short intervalMinutes
    Short intervalMonths
    Short operatingStatusPushMode
    Boolean ps
    Integer pushDataset
    Short pushNodeId
}