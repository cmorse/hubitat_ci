package me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait NotificationSupportedReport implements Command
{
    Boolean accessControl
    Boolean appliance
    Boolean burglar
    Boolean clock
    Boolean co
    Boolean co2
    Boolean emergency
    Boolean first
    Boolean gasAlarm
    Boolean heat
    Boolean homeHealth
    Boolean homeMonitoring
    Boolean irrigation
    Boolean lightSensor
    Boolean pestControl
    Boolean powerManagement
    Boolean siren
    Boolean smoke
    Boolean system
    Boolean water
    Boolean waterQuality
    Boolean waterValve
    Boolean weatherAlarm
}