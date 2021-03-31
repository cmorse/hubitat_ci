package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2.DeviceSpecificGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2.DeviceSpecificReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2.ManufacturerSpecificGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2.ManufacturerSpecificReport

trait ManufacturerSpecificV2
{
    abstract DeviceSpecificGet deviceSpecificGet(Map arg0=null)
    abstract DeviceSpecificReport deviceSpecificReport(Map arg0=null)
    abstract ManufacturerSpecificGet manufacturerSpecificGet(Map arg0=null)
    abstract ManufacturerSpecificReport manufacturerSpecificReport(Map arg0=null)
}
