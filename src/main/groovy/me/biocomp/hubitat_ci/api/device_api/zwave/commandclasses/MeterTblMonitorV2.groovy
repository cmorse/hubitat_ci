package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblCurrentDataGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblCurrentDataReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblHistoricalDataGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblHistoricalDataReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusDateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusDepthGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTableCapabilityGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTableIdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTableIdReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTablePointAdmNoGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTablePointAdmNoReport

trait MeterTblMonitorV2
{
    abstract MeterTblCurrentDataGet meterTblCurrentDataGet(Map arg0=null)
    abstract MeterTblCurrentDataReport meterTblCurrentDataReport(Map arg0=null)
    abstract MeterTblHistoricalDataGet meterTblHistoricalDataGet(Map arg0=null)
    abstract MeterTblHistoricalDataReport meterTblHistoricalDataReport(Map arg0=null)
    abstract MeterTblReport meterTblReport(Map arg0=null)
    abstract MeterTblStatusDateGet meterTblStatusDateGet(Map arg0=null)
    abstract MeterTblStatusDepthGet meterTblStatusDepthGet(Map arg0=null)
    abstract MeterTblStatusReport meterTblStatusReport(Map arg0=null)
    abstract MeterTblStatusSupportedGet meterTblStatusSupportedGet(Map arg0=null)
    abstract MeterTblStatusSupportedReport meterTblStatusSupportedReport(Map arg0=null)
    abstract MeterTblTableCapabilityGet meterTblTableCapabilityGet(Map arg0=null)
    abstract MeterTblTableIdGet meterTblTableIdGet(Map arg0=null)
    abstract MeterTblTableIdReport meterTblTableIdReport(Map arg0=null)
    abstract MeterTblTablePointAdmNoGet meterTblTablePointAdmNoGet(Map arg0=null)
    abstract MeterTblTablePointAdmNoReport meterTblTablePointAdmNoReport(Map arg0=null)
}
