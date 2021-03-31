package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv1.AntitheftGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv1.AntitheftReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv1.AntitheftSet

trait AntitheftV1
{
    abstract AntitheftGet antitheftGet(Map arg0=null)
    abstract AntitheftReport antitheftReport(Map arg0=null)
    abstract AntitheftSet antitheftSet(Map arg0=null)
}
