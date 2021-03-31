package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.applicationstatusv1.ApplicationBusy
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.applicationstatusv1.ApplicationRejectedRequest

trait ApplicationStatusV1
{
    abstract ApplicationBusy applicationBusy(Map arg0=null)
    abstract ApplicationRejectedRequest applicationRejectedRequest(Map arg0=null)
}
