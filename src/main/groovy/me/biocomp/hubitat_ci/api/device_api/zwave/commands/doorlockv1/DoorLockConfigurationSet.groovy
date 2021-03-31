package me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DoorLockConfigurationSet implements Command
{
    Short insideDoorHandlesState
    Short lockTimeoutMinutes
    Short lockTimeoutSeconds
    Short operationType
    Short outsideDoorHandlesState
    static Short OPERATION_TYPE_CONSTANT_OPERATION = 1
    static Short OPERATION_TYPE_TIMED_OPERATION = 2
}