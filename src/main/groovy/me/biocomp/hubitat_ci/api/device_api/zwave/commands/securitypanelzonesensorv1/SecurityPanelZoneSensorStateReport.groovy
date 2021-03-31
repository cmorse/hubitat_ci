package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityPanelZoneSensorStateReport implements Command
{
    Short eventParameters
    Short sensorNumber
    Short zoneNumber
    Short zwaveAlarmEvent
    Short zwaveAlarmType
}