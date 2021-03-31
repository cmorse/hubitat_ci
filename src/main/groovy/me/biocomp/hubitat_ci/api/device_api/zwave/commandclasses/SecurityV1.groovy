package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.NetworkKeySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.NetworkKeyVerify
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityCommandsSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityCommandsSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityMessageEncapsulation
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityMessageEncapsulationNonceGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityNonceGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityNonceReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecuritySchemeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecuritySchemeInherit
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecuritySchemeReport

trait SecurityV1
{
    abstract NetworkKeySet networkKeySet(Map arg0=null)
    abstract NetworkKeyVerify networkKeyVerify(Map arg0=null)
    abstract SecurityCommandsSupportedGet securityCommandsSupportedGet(Map arg0=null)
    abstract SecurityCommandsSupportedReport securityCommandsSupportedReport(Map arg0=null)
    abstract SecurityMessageEncapsulation securityMessageEncapsulation(Map arg0=null)
    abstract SecurityMessageEncapsulationNonceGet securityMessageEncapsulationNonceGet(Map arg0=null)
    abstract SecurityNonceGet securityNonceGet(Map arg0=null)
    abstract SecurityNonceReport securityNonceReport(Map arg0=null)
    abstract SecuritySchemeGet securitySchemeGet(Map arg0=null)
    abstract SecuritySchemeInherit securitySchemeInherit(Map arg0=null)
    abstract SecuritySchemeReport securitySchemeReport(Map arg0=null)
}
