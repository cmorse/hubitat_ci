package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1.DcpEventStatusGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1.DcpEventStatusReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1.DcpListGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1.DcpListReport

trait DcpMonitorV1
{
    abstract DcpEventStatusGet dcpEventStatusGet(Map arg0=null)
    abstract DcpEventStatusReport dcpEventStatusReport(Map arg0=null)
    abstract DcpListGet dcpListGet(Map arg0=null)
    abstract DcpListReport dcpListReport(Map arg0=null)
}
