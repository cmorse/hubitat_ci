package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontroloperatingstatev1.HumidityControlOperatingStateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontroloperatingstatev1.HumidityControlOperatingStateReport

trait HumidityControlOperatingStateV1
{
    abstract HumidityControlOperatingStateGet humidityControlOperatingStateGet(Map arg0=null)
    abstract HumidityControlOperatingStateReport humidityControlOperatingStateReport(Map arg0=null)
}
