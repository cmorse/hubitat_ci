package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv1.IndicatorGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv1.IndicatorReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv1.IndicatorSet

trait IndicatorV1
{
    abstract IndicatorGet indicatorGet(Map arg0=null)
    abstract IndicatorReport indicatorReport(Map arg0=null)
    abstract IndicatorSet indicatorSet(Map arg0=null)
}
