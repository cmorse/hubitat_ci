package me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ProtectionReport implements Command
{
    Short protectionState
    static Short PROTECTION_STATE_NO_OPERATION_POSSIBLE = 2
    static Short PROTECTION_STATE_PROTECTION_BY_SEQUENCE = 1
    static Short PROTECTION_STATE_UNPROTECTED = 0
}