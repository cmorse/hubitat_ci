package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelStartLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelStopLevelChange

trait SwitchToggleMultilevelV1
{
    abstract SwitchToggleMultilevelGet switchToggleMultilevelGet(Map arg0=null)
    abstract SwitchToggleMultilevelReport switchToggleMultilevelReport(Map arg0=null)
    abstract SwitchToggleMultilevelSet switchToggleMultilevelSet(Map arg0=null)
    abstract SwitchToggleMultilevelStartLevelChange switchToggleMultilevelStartLevelChange(Map arg0=null)
    abstract SwitchToggleMultilevelStopLevelChange switchToggleMultilevelStopLevelChange(Map arg0=null)
}
