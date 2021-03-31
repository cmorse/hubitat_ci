package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.EventSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.EventSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationSupportedReport

trait NotificationV5
{
    abstract EventSupportedGet eventSupportedGet(Map arg0=null)
    abstract EventSupportedReport eventSupportedReport(Map arg0=null)
    abstract NotificationGet notificationGet(Map arg0=null)
    abstract NotificationReport notificationReport(Map arg0=null)
    abstract NotificationSet notificationSet(Map arg0=null)
    abstract NotificationSupportedGet notificationSupportedGet(Map arg0=null)
    abstract NotificationSupportedReport notificationSupportedReport(Map arg0=null)
}
