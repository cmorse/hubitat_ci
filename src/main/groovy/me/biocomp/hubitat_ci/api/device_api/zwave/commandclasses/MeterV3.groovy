package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterReset
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterSupportedReport

trait MeterV3
{
    abstract MeterGet meterGet(Map arg0=null)
    abstract MeterReport meterReport(Map arg0=null)
    abstract MeterReset meterReset(Map arg0=null)
    abstract MeterSupportedGet meterSupportedGet(Map arg0=null)
    abstract MeterSupportedReport meterSupportedReport(Map arg0=null)
}
