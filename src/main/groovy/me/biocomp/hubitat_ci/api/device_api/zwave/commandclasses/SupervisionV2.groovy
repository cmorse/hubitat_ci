package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv2.SupervisionGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv2.SupervisionReport

trait SupervisionV2
{
    abstract SupervisionGet supervisionGet(Map arg0=null)
    abstract SupervisionReport supervisionReport(Map arg0=null)
}
