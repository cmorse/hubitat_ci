package me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait EventSupportedReport implements Command
{
    Short notificationType
    Map supportedEvents
}