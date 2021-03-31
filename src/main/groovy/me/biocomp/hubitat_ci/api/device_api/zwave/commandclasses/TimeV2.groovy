package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.DateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.DateReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeOffsetGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeOffsetReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeOffsetSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeReport

trait TimeV2
{
    abstract DateGet dateGet(Map arg0=null)
    abstract DateReport dateReport(Map arg0=null)
    abstract TimeGet timeGet(Map arg0=null)
    abstract TimeOffsetGet timeOffsetGet(Map arg0=null)
    abstract TimeOffsetReport timeOffsetReport(Map arg0=null)
    abstract TimeOffsetSet timeOffsetSet(Map arg0=null)
    abstract TimeReport timeReport(Map arg0=null)
}
