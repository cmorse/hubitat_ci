package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv1.ManufacturerSpecificGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv1.ManufacturerSpecificReport

trait ManufacturerSpecificV1
{
    abstract ManufacturerSpecificGet manufacturerSpecificGet(Map arg0=null)
    abstract ManufacturerSpecificReport manufacturerSpecificReport(Map arg0=null)
}
