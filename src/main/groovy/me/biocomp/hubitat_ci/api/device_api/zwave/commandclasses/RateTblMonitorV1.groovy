package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblActiveRateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblActiveRateReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblCurrentDataGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblCurrentDataReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblHistoricalDataGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblHistoricalDataReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblSupportedReport

trait RateTblMonitorV1
{
    abstract RateTblActiveRateGet rateTblActiveRateGet(Map arg0=null)
    abstract RateTblActiveRateReport rateTblActiveRateReport(Map arg0=null)
    abstract RateTblCurrentDataGet rateTblCurrentDataGet(Map arg0=null)
    abstract RateTblCurrentDataReport rateTblCurrentDataReport(Map arg0=null)
    abstract RateTblGet rateTblGet(Map arg0=null)
    abstract RateTblHistoricalDataGet rateTblHistoricalDataGet(Map arg0=null)
    abstract RateTblHistoricalDataReport rateTblHistoricalDataReport(Map arg0=null)
    abstract RateTblReport rateTblReport(Map arg0=null)
    abstract RateTblSupportedGet rateTblSupportedGet(Map arg0=null)
    abstract RateTblSupportedReport rateTblSupportedReport(Map arg0=null)
}
