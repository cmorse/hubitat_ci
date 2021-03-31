package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.EventSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.EventSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationSupportedReport

trait NotificationV8
{
    abstract EventSupportedGet eventSupportedGet(Map arg0=null)
    abstract EventSupportedReport eventSupportedReport(Map arg0=null)
    abstract NotificationGet notificationGet(Map arg0=null)
    abstract NotificationReport notificationReport(Map arg0=null)
    abstract NotificationSet notificationSet(Map arg0=null)
    abstract NotificationSupportedGet notificationSupportedGet(Map arg0=null)
    abstract NotificationSupportedReport notificationSupportedReport(Map arg0=null)
}
