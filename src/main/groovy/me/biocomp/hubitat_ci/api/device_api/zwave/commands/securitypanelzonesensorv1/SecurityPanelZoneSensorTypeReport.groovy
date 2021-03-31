package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityPanelZoneSensorTypeReport implements Command
{
    Short sensorNumber
    Short zoneNumber
    Short zwaveAlarmType
}