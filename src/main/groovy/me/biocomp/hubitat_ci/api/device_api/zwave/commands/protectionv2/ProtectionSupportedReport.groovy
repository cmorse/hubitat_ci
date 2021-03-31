package me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ProtectionSupportedReport implements Command
{
    Boolean exclusiveControl
    Integer localProtectionState
    Integer rfProtectionState
    Boolean timeout
}