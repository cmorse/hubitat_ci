package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglebinaryv1.SwitchToggleBinaryGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglebinaryv1.SwitchToggleBinaryReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglebinaryv1.SwitchToggleBinarySet

trait SwitchToggleBinaryV1
{
    abstract SwitchToggleBinaryGet switchToggleBinaryGet(Map arg0=null)
    abstract SwitchToggleBinaryReport switchToggleBinaryReport(Map arg0=null)
    abstract SwitchToggleBinarySet switchToggleBinarySet(Map arg0=null)
}
