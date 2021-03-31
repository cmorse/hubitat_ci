package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockConfigurationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockOperationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockOperationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockOperationSet

trait DoorLockV1
{
    abstract DoorLockConfigurationGet doorLockConfigurationGet(Map arg0=null)
    abstract DoorLockConfigurationReport doorLockConfigurationReport(Map arg0=null)
    abstract DoorLockConfigurationSet doorLockConfigurationSet(Map arg0=null)
    abstract DoorLockOperationGet doorLockOperationGet(Map arg0=null)
    abstract DoorLockOperationReport doorLockOperationReport(Map arg0=null)
    abstract DoorLockOperationSet doorLockOperationSet(Map arg0=null)
}
