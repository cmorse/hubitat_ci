package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv1.BasicGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv1.BasicReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv1.BasicSet

trait BasicV1
{
    abstract BasicGet basicGet(Map arg0=null)
    abstract BasicReport basicReport(Map arg0=null)
    abstract BasicSet basicSet(Map arg0=null)
}
