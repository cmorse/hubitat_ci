package me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv7

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
    Boolean irrigation
    Boolean powerManagement
    Boolean siren
    Boolean smoke
    Boolean system
    Boolean water
    Boolean waterValve
    Boolean weatherAlarm
}