package me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DoorLockOperationReport implements Command
{
    Short doorCondition
    Short doorLockMode
    Short insideDoorHandlesMode
    Short lockTimeoutMinutes
    Short lockTimeoutSeconds
    Short outsideDoorHandlesMode
    static Short DOOR_LOCK_MODE_DOOR_SECURED = 255
    static Short DOOR_LOCK_MODE_DOOR_UNSECURED = 0
    static Short DOOR_LOCK_MODE_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES = 16
    static Short DOOR_LOCK_MODE_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT = 17
    static Short DOOR_LOCK_MODE_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES = 32
    static Short DOOR_LOCK_MODE_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT = 33
    static Short DOOR_LOCK_MODE_DOOR_UNSECURED_WITH_TIMEOUT = 1
}