package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionCapabilitiesGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionCapabilitiesReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionCommandClassGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionCommandClassReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionZWaveSoftwareGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionZWaveSoftwareReport

trait VersionV3
{
    abstract VersionCapabilitiesGet versionCapabilitiesGet(Map arg0=null)
    abstract VersionCapabilitiesReport versionCapabilitiesReport(Map arg0=null)
    abstract VersionCommandClassGet versionCommandClassGet(Map arg0=null)
    abstract VersionCommandClassReport versionCommandClassReport(Map arg0=null)
    abstract VersionGet versionGet(Map arg0=null)
    abstract VersionReport versionReport(Map arg0=null)
    abstract VersionZWaveSoftwareGet versionZWaveSoftwareGet(Map arg0=null)
    abstract VersionZWaveSoftwareReport versionZWaveSoftwareReport(Map arg0=null)
}
