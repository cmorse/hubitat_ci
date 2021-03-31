package me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5

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
    Boolean heat
    Boolean homeHealth
    Boolean powerManagement
    Boolean smoke
    Boolean system
    Boolean water
}