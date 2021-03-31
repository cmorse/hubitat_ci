package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeSupportedReport

trait HumidityControlModeV2
{
    abstract HumidityControlModeGet humidityControlModeGet(Map arg0=null)
    abstract HumidityControlModeReport humidityControlModeReport()
    abstract HumidityControlModeSet humidityControlModeSet(Map arg0=null)
    abstract HumidityControlModeSupportedGet humidityControlModeSupportedGet(Map arg0=null)
    abstract HumidityControlModeSupportedReport humidityControlModeSupportedReport(Map arg0=null)
}
