package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avrendererstatusv1.AvRendererStatusGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avrendererstatusv1.AvRendererStatusReport

trait AvRendererStatusV1
{
    abstract AvRendererStatusGet avRendererStatusGet(Map arg0=null)
    abstract AvRendererStatusReport avRendererStatusReport(Map arg0=null)
}
