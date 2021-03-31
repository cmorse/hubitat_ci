package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.KexFail
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.KexGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.KexReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.KexSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.PublicKeyReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2CommandsSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2CommandsSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2MessageEncapsulation
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NetworkKeyGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NetworkKeyReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NetworkKeyVerify
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NonceGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NonceReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2TransferEnd

trait Security2V1
{
    abstract KexFail kexFail(Map arg0=null)
    abstract KexGet kexGet(Map arg0=null)
    abstract KexReport kexReport(Map arg0=null)
    abstract KexSet kexSet(Map arg0=null)
    abstract PublicKeyReport publicKeyReport(Map arg0=null)
    abstract Security2CommandsSupportedGet security2CommandsSupportedGet(Map arg0=null)
    abstract Security2CommandsSupportedReport security2CommandsSupportedReport(Map arg0=null)
    abstract Security2MessageEncapsulation security2MessageEncapsulation(Map arg0=null)
    abstract Security2NetworkKeyGet security2NetworkKeyGet(Map arg0=null)
    abstract Security2NetworkKeyReport security2NetworkKeyReport(Map arg0=null)
    abstract Security2NetworkKeyVerify security2NetworkKeyVerify(Map arg0=null)
    abstract Security2NonceGet security2NonceGet(Map arg0=null)
    abstract Security2NonceReport security2NonceReport(Map arg0=null)
    abstract Security2TransferEnd security2TransferEnd(Map arg0=null)
}
