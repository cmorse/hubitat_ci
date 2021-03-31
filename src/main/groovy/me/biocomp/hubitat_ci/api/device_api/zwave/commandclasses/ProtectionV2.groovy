package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionEcGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionEcReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionEcSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionTimeoutGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionTimeoutReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionTimeoutSet

trait ProtectionV2
{
    abstract ProtectionEcGet protectionEcGet(Map arg0=null)
    abstract ProtectionEcReport protectionEcReport(Map arg0=null)
    abstract ProtectionEcSet protectionEcSet(Map arg0=null)
    abstract ProtectionGet protectionGet(Map arg0=null)
    abstract ProtectionReport protectionReport(Map arg0=null)
    abstract ProtectionSet protectionSet(Map arg0=null)
    abstract ProtectionSupportedGet protectionSupportedGet(Map arg0=null)
    abstract ProtectionSupportedReport protectionSupportedReport(Map arg0=null)
    abstract ProtectionTimeoutGet protectionTimeoutGet(Map arg0=null)
    abstract ProtectionTimeoutReport protectionTimeoutReport(Map arg0=null)
    abstract ProtectionTimeoutSet protectionTimeoutSet(Map arg0=null)
}
