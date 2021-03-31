package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv2.VersionCommandClassGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv2.VersionCommandClassReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv2.VersionGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv2.VersionReport

trait VersionV2
{
    abstract VersionCommandClassGet versionCommandClassGet(Map arg0=null)
    abstract VersionCommandClassReport versionCommandClassReport(Map arg0=null)
    abstract VersionGet versionGet(Map arg0=null)
    abstract VersionReport versionReport(Map arg0=null)
}
