package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timeparametersv1.TimeParametersGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timeparametersv1.TimeParametersReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.timeparametersv1.TimeParametersSet

trait TimeParametersV1
{
    abstract TimeParametersGet timeParametersGet(Map arg0=null)
    abstract TimeParametersReport timeParametersReport(Map arg0=null)
    abstract TimeParametersSet timeParametersSet(Map arg0=null)
}
