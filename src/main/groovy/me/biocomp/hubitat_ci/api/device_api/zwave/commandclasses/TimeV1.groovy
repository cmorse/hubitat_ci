package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1.DateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1.DateReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1.TimeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1.TimeReport

trait TimeV1
{
    abstract DateGet dateGet(Map arg0=null)
    abstract DateReport dateReport(Map arg0=null)
    abstract TimeGet timeGet(Map arg0=null)
    abstract TimeReport timeReport(Map arg0=null)
}
