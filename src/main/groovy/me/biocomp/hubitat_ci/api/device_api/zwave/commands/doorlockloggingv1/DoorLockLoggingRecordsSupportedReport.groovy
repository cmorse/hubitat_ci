package me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DoorLockLoggingRecordsSupportedReport implements Command
{
    Short maxRecordsStored
}