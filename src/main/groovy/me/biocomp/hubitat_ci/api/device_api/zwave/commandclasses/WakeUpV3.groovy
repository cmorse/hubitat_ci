package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalCapabilitiesGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalCapabilitiesReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpNoMoreInformation
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpNotification

trait WakeUpV3
{
    abstract WakeUpIntervalCapabilitiesGet wakeUpIntervalCapabilitiesGet(Map arg0=null)
    abstract WakeUpIntervalCapabilitiesReport wakeUpIntervalCapabilitiesReport(Map arg0=null)
    abstract WakeUpIntervalGet wakeUpIntervalGet(Map arg0=null)
    abstract WakeUpIntervalReport wakeUpIntervalReport(Map arg0=null)
    abstract WakeUpIntervalSet wakeUpIntervalSet(Map arg0=null)
    abstract WakeUpNoMoreInformation wakeUpNoMoreInformation(Map arg0=null)
    abstract WakeUpNotification wakeUpNotification(Map arg0=null)
}
