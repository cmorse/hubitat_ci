package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareMdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareMdReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdRequestGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdRequestReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdStatusReport

trait FirmwareUpdateMdV1
{
    abstract FirmwareMdGet firmwareMdGet(Map arg0=null)
    abstract FirmwareMdReport firmwareMdReport(Map arg0=null)
    abstract FirmwareUpdateMdGet firmwareUpdateMdGet(Map arg0=null)
    abstract FirmwareUpdateMdReport firmwareUpdateMdReport(Map arg0=null)
    abstract FirmwareUpdateMdRequestGet firmwareUpdateMdRequestGet(Map arg0=null)
    abstract FirmwareUpdateMdRequestReport firmwareUpdateMdRequestReport(Map arg0=null)
    abstract FirmwareUpdateMdStatusReport firmwareUpdateMdStatusReport(Map arg0=null)
}
