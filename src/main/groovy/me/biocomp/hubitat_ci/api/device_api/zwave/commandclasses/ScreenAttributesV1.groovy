package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv1.ScreenAttributesGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv1.ScreenAttributesReport

trait ScreenAttributesV1
{
    abstract ScreenAttributesGet screenAttributesGet(Map arg0=null)
    abstract ScreenAttributesReport screenAttributesReport(Map arg0=null)
}
