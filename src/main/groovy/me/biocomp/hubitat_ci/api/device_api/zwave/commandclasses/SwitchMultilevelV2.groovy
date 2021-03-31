package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelStartLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelStopLevelChange

trait SwitchMultilevelV2
{
    abstract SwitchMultilevelGet switchMultilevelGet(Map arg0=null)
    abstract SwitchMultilevelReport switchMultilevelReport(Map arg0=null)
    abstract SwitchMultilevelSet switchMultilevelSet(Map arg0=null)
    abstract SwitchMultilevelStartLevelChange switchMultilevelStartLevelChange(Map arg0=null)
    abstract SwitchMultilevelStopLevelChange switchMultilevelStopLevelChange(Map arg0=null)
}
