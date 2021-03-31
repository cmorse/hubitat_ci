package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.geographiclocationv1.GeographicLocationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.geographiclocationv1.GeographicLocationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.geographiclocationv1.GeographicLocationSet

trait GeographicLocationV1
{
    abstract GeographicLocationGet geographicLocationGet(Map arg0=null)
    abstract GeographicLocationReport geographicLocationReport(Map arg0=null)
    abstract GeographicLocationSet geographicLocationSet(Map arg0=null)
}
