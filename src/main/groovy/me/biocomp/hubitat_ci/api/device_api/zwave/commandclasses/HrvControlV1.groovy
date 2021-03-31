package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlBypassGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlBypassReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlBypassSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlVentilationRateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlVentilationRateReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlVentilationRateSet

trait HrvControlV1
{
    abstract HrvControlBypassGet hrvControlBypassGet(Map arg0=null)
    abstract HrvControlBypassReport hrvControlBypassReport(Map arg0=null)
    abstract HrvControlBypassSet hrvControlBypassSet(Map arg0=null)
    abstract HrvControlModeGet hrvControlModeGet(Map arg0=null)
    abstract HrvControlModeReport hrvControlModeReport(Map arg0=null)
    abstract HrvControlModeSet hrvControlModeSet(Map arg0=null)
    abstract HrvControlModeSupportedGet hrvControlModeSupportedGet(Map arg0=null)
    abstract HrvControlModeSupportedReport hrvControlModeSupportedReport(Map arg0=null)
    abstract HrvControlVentilationRateGet hrvControlVentilationRateGet(Map arg0=null)
    abstract HrvControlVentilationRateReport hrvControlVentilationRateReport(Map arg0=null)
    abstract HrvControlVentilationRateSet hrvControlVentilationRateSet(Map arg0=null)
}
