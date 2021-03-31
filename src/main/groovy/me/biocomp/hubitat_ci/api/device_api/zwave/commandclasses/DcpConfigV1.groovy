package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1.DcpListRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1.DcpListSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1.DcpListSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1.DcpListSupportedReport

trait DcpConfigV1
{
    abstract DcpListRemove dcpListRemove(Map arg0=null)
    abstract DcpListSet dcpListSet(Map arg0=null)
    abstract DcpListSupportedGet dcpListSupportedGet(Map arg0=null)
    abstract DcpListSupportedReport dcpListSupportedReport(Map arg0=null)
}
