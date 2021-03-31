package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalCapabilitiesGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalCapabilitiesReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpNoMoreInformation
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpNotification

trait WakeUpV2
{
    abstract WakeUpIntervalCapabilitiesGet wakeUpIntervalCapabilitiesGet(Map arg0=null)
    abstract WakeUpIntervalCapabilitiesReport wakeUpIntervalCapabilitiesReport(Map arg0=null)
    abstract WakeUpIntervalGet wakeUpIntervalGet(Map arg0=null)
    abstract WakeUpIntervalReport wakeUpIntervalReport(Map arg0=null)
    abstract WakeUpIntervalSet wakeUpIntervalSet(Map arg0=null)
    abstract WakeUpNoMoreInformation wakeUpNoMoreInformation(Map arg0=null)
    abstract WakeUpNotification wakeUpNotification(Map arg0=null)
}
