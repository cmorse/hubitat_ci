package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorSupportedReport

trait IndicatorV3
{
    abstract IndicatorGet indicatorGet(Map arg0=null)
    abstract IndicatorReport indicatorReport(Map arg0=null)
    abstract IndicatorSet indicatorSet(Map arg0=null)
    abstract IndicatorSupportedGet indicatorSupportedGet(Map arg0=null)
    abstract IndicatorSupportedReport indicatorSupportedReport(Map arg0=null)
}
