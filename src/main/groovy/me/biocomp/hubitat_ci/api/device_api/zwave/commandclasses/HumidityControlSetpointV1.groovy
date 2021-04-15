package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointCapabilitiesGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointCapabilitiesReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointScaleSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointScaleSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointSupportedReport

trait HumidityControlSetpointV1
{
    abstract HumidityControlSetpointCapabilitiesGet humidityControlSetpointCapabilitiesGet(Map arg0=null)
    abstract HumidityControlSetpointCapabilitiesReport humidityControlSetpointCapabilitiesReport(Map arg0=null)
    abstract HumidityControlSetpointGet humidityControlSetpointGet(Map arg0=null)
    abstract HumidityControlSetpointReport humidityControlSetpointReport(Map arg0=null)
    abstract HumidityControlSetpointScaleSupportedGet humidityControlSetpointScaleSupportedGet(Map arg0=null)
    abstract HumidityControlSetpointScaleSupportedReport humidityControlSetpointScaleSupportedReport(Map arg0=null)
    abstract HumidityControlSetpointSet humidityControlSetpointSet(Map arg0=null)
    abstract HumidityControlSetpointSupportedGet humidityControlSetpointSupportedGet(Map arg0=null)
    abstract HumidityControlSetpointSupportedReport humidityControlSetpointSupportedReport(Map arg0=null)
}