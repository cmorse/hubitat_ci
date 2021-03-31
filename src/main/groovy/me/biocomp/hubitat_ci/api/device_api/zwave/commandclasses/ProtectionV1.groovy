package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv1.ProtectionGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv1.ProtectionReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv1.ProtectionSet

trait ProtectionV1
{
    abstract ProtectionGet protectionGet(Map arg0=null)
    abstract ProtectionReport protectionReport(Map arg0=null)
    abstract ProtectionSet protectionSet(Map arg0=null)
}
