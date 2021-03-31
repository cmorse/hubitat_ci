package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avtaggingmdv1.AvTaggingMdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avtaggingmdv1.AvTaggingMdReport

trait AvTaggingMdV1
{
    abstract AvTaggingMdGet avTaggingMdGet(Map arg0=null)
    abstract AvTaggingMdReport avTaggingMdReport(Map arg0=null)
}
