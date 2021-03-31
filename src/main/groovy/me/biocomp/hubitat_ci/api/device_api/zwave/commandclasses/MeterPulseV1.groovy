package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterpulsev1.MeterPulseGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterpulsev1.MeterPulseReport

trait MeterPulseV1
{
    abstract MeterPulseGet meterPulseGet(Map arg0=null)
    abstract MeterPulseReport meterPulseReport(Map arg0=null)
}
