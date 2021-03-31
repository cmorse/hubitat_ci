package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv2.ScreenAttributesGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv2.ScreenAttributesReport

trait ScreenAttributesV2
{
    abstract ScreenAttributesGet screenAttributesGet(Map arg0=null)
    abstract ScreenAttributesReport screenAttributesReport(Map arg0=null)
}
