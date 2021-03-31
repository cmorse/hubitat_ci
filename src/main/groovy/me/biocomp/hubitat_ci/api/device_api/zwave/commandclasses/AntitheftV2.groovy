package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv2.AntitheftGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv2.AntitheftReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv2.AntitheftSet

trait AntitheftV2
{
    abstract AntitheftGet antitheftGet(Map arg0=null)
    abstract AntitheftReport antitheftReport(Map arg0=null)
    abstract AntitheftSet antitheftSet(Map arg0=null)
}
