package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentsearchmdv1.AvContentSearchMdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentsearchmdv1.AvContentSearchMdReport

trait AvContentSearchMdV1
{
    abstract AvContentSearchMdGet avContentSearchMdGet(Map arg0=null)
    abstract AvContentSearchMdReport avContentSearchMdReport(Map arg0=null)
}
