package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeSupportedReport

trait SecurityPanelModeV1
{
    abstract SecurityPanelModeGet securityPanelModeGet(Map arg0=null)
    abstract SecurityPanelModeReport securityPanelModeReport(Map arg0=null)
    abstract SecurityPanelModeSet securityPanelModeSet(Map arg0=null)
    abstract SecurityPanelModeSupportedGet securityPanelModeSupportedGet(Map arg0=null)
    abstract SecurityPanelModeSupportedReport securityPanelModeSupportedReport(Map arg0=null)
}
