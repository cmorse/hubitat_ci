package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.proprietaryv1.ProprietaryGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.proprietaryv1.ProprietaryReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.proprietaryv1.ProprietarySet

trait ProprietaryV1
{
    abstract ProprietaryGet proprietaryGet(Map arg0=null)
    abstract ProprietaryReport proprietaryReport(Map arg0=null)
    abstract ProprietarySet proprietarySet(Map arg0=null)
}
