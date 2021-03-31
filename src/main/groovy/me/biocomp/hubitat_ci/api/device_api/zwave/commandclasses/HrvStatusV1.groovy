package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1.HrvStatusGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1.HrvStatusReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1.HrvStatusSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1.HrvStatusSupportedReport

trait HrvStatusV1
{
    abstract HrvStatusGet hrvStatusGet(Map arg0=null)
    abstract HrvStatusReport hrvStatusReport(Map arg0=null)
    abstract HrvStatusSupportedGet hrvStatusSupportedGet(Map arg0=null)
    abstract HrvStatusSupportedReport hrvStatusSupportedReport(Map arg0=null)
}
