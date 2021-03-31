package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllOff
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllOn
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllSet

trait SwitchAllV1
{
    abstract SwitchAllGet switchAllGet(Map arg0=null)
    abstract SwitchAllOff switchAllOff(Map arg0=null)
    abstract SwitchAllOn switchAllOn(Map arg0=null)
    abstract SwitchAllReport switchAllReport(Map arg0=null)
    abstract SwitchAllSet switchAllSet(Map arg0=null)
}
