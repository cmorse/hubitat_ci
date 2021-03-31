package me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait NotificationSupportedReport implements Command
{
    Boolean accessControl
    Boolean burglar
    Boolean clock
    Boolean co
    Boolean co2
    Boolean emergency
    Boolean first
    Boolean heat
    Boolean powerManagement
    Boolean smoke
    Boolean system
    Boolean water
}