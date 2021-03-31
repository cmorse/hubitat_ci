package me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ProtectionSet implements Command
{
    Short localProtectionState
    Short protectionState
    Short rfProtectionState
    static Short PROTECTION_STATE_NO_OPERATION_POSSIBLE = 2
    static Short PROTECTION_STATE_PROTECTION_BY_SEQUENCE = 1
    static Short PROTECTION_STATE_UNPROTECTED = 0
}