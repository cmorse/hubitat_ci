package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpIntervalGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpIntervalReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpIntervalSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpNoMoreInformation
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpNotification

trait WakeUpV1
{
    abstract WakeUpIntervalGet wakeUpIntervalGet(Map arg0=null)
    abstract WakeUpIntervalReport wakeUpIntervalReport(Map arg0=null)
    abstract WakeUpIntervalSet wakeUpIntervalSet(Map arg0=null)
    abstract WakeUpNoMoreInformation wakeUpNoMoreInformation(Map arg0=null)
    abstract WakeUpNotification wakeUpNotification(Map arg0=null)
}
