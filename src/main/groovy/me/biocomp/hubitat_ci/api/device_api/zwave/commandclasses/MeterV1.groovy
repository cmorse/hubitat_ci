package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv1.MeterGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv1.MeterReport

trait MeterV1
{
    abstract MeterGet meterGet(Map arg0=null)
    abstract MeterReport meterReport(Map arg0=null)
}
