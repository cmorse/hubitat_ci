package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.lockv1.LockGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.lockv1.LockReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.lockv1.LockSet

trait LockV1
{
    abstract LockGet lockGet(Map arg0=null)
    abstract LockReport lockReport(Map arg0=null)
    abstract LockSet lockSet(Map arg0=null)
}
