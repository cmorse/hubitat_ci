package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelStartLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelStopLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelSupportedReport

trait SwitchMultilevelV3
{
    abstract SwitchMultilevelGet switchMultilevelGet(Map arg0=null)
    abstract SwitchMultilevelReport switchMultilevelReport(Map arg0=null)
    abstract SwitchMultilevelSet switchMultilevelSet(Map arg0=null)
    abstract SwitchMultilevelStartLevelChange switchMultilevelStartLevelChange(Map arg0=null)
    abstract SwitchMultilevelStopLevelChange switchMultilevelStopLevelChange(Map arg0=null)
    abstract SwitchMultilevelSupportedGet switchMultilevelSupportedGet(Map arg0=null)
    abstract SwitchMultilevelSupportedReport switchMultilevelSupportedReport(Map arg0=null)
}
