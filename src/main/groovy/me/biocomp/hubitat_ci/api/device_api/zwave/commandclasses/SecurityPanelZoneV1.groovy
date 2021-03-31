package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneNumberSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneStateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneStateReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneTypeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneTypeReport

trait SecurityPanelZoneV1
{
    abstract SecurityPanelZoneNumberSupportedGet securityPanelZoneNumberSupportedGet(Map arg0=null)
    abstract SecurityPanelZoneStateGet securityPanelZoneStateGet(Map arg0=null)
    abstract SecurityPanelZoneStateReport securityPanelZoneStateReport(Map arg0=null)
    abstract SecurityPanelZoneSupportedReport securityPanelZoneSupportedReport(Map arg0=null)
    abstract SecurityPanelZoneTypeGet securityPanelZoneTypeGet(Map arg0=null)
    abstract SecurityPanelZoneTypeReport securityPanelZoneTypeReport(Map arg0=null)
}
