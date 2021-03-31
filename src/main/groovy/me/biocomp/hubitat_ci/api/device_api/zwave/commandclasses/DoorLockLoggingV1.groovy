package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1.DoorLockLoggingRecordsSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1.DoorLockLoggingRecordsSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1.RecordGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1.RecordReport

trait DoorLockLoggingV1
{
    abstract DoorLockLoggingRecordsSupportedGet doorLockLoggingRecordsSupportedGet(Map arg0=null)
    abstract DoorLockLoggingRecordsSupportedReport doorLockLoggingRecordsSupportedReport(Map arg0=null)
    abstract RecordGet recordGet(Map arg0=null)
    abstract RecordReport recordReport(Map arg0=null)
}
