package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1.PrepaymentBalanceGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1.PrepaymentBalanceReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1.PrepaymentSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1.PrepaymentSupportedReport

trait PrepaymentV1
{
    abstract PrepaymentBalanceGet prepaymentBalanceGet(Map arg0=null)
    abstract PrepaymentBalanceReport prepaymentBalanceReport(Map arg0=null)
    abstract PrepaymentSupportedGet prepaymentSupportedGet(Map arg0=null)
    abstract PrepaymentSupportedReport prepaymentSupportedReport(Map arg0=null)
}
