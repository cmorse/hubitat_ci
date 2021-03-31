package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv1.SupervisionGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv1.SupervisionReport

trait SupervisionV1
{
    abstract SupervisionGet supervisionGet(Map arg0=null)
    abstract SupervisionReport supervisionReport(Map arg0=null)
}
