package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblpushv1.MeterTblPushConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblpushv1.MeterTblPushConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblpushv1.MeterTblPushConfigurationSet

trait MeterTblPushV1
{
    abstract MeterTblPushConfigurationGet meterTblPushConfigurationGet(Map arg0=null)
    abstract MeterTblPushConfigurationReport meterTblPushConfigurationReport(Map arg0=null)
    abstract MeterTblPushConfigurationSet meterTblPushConfigurationSet(Map arg0=null)
}
