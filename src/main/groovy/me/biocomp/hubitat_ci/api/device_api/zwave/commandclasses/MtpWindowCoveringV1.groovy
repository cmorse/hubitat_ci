package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.mtpwindowcoveringv1.MoveToPositionGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.mtpwindowcoveringv1.MoveToPositionReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.mtpwindowcoveringv1.MoveToPositionSet

trait MtpWindowCoveringV1
{
    abstract MoveToPositionGet moveToPositionGet(Map arg0=null)
    abstract MoveToPositionReport moveToPositionReport(Map arg0=null)
    abstract MoveToPositionSet moveToPositionSet(Map arg0=null)
}
