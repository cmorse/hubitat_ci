package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv2.SwitchBinaryGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv2.SwitchBinaryReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv2.SwitchBinarySet

trait SwitchBinaryV2
{
    abstract SwitchBinaryGet switchBinaryGet(Map arg0=null)
    abstract SwitchBinaryReport switchBinaryReport(Map arg0=null)
    abstract SwitchBinarySet switchBinarySet(Map arg0=null)
}
