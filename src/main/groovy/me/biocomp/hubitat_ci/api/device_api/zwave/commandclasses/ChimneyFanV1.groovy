package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmLogGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmLogReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmLogSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmStatusGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmStatusReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmStatusSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmTempGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmTempReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmTempSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanBoostTimeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanBoostTimeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanBoostTimeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanDefaultSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanMinSpeedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanMinSpeedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanMinSpeedSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanModeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanModeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanModeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSetupGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSetupReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSetupSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSpeedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSpeedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSpeedSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStartTempGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStartTempReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStartTempSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStateGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStateReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStateSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStatusGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStatusReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTempGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTempReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTempSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTimeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTimeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTimeSet

trait ChimneyFanV1
{
    abstract ChimneyFanAlarmLogGet chimneyFanAlarmLogGet(Map arg0=null)
    abstract ChimneyFanAlarmLogReport chimneyFanAlarmLogReport(Map arg0=null)
    abstract ChimneyFanAlarmLogSet chimneyFanAlarmLogSet(Map arg0=null)
    abstract ChimneyFanAlarmStatusGet chimneyFanAlarmStatusGet(Map arg0=null)
    abstract ChimneyFanAlarmStatusReport chimneyFanAlarmStatusReport(Map arg0=null)
    abstract ChimneyFanAlarmStatusSet chimneyFanAlarmStatusSet(Map arg0=null)
    abstract ChimneyFanAlarmTempGet chimneyFanAlarmTempGet(Map arg0=null)
    abstract ChimneyFanAlarmTempReport chimneyFanAlarmTempReport(Map arg0=null)
    abstract ChimneyFanAlarmTempSet chimneyFanAlarmTempSet(Map arg0=null)
    abstract ChimneyFanBoostTimeGet chimneyFanBoostTimeGet(Map arg0=null)
    abstract ChimneyFanBoostTimeReport chimneyFanBoostTimeReport(Map arg0=null)
    abstract ChimneyFanBoostTimeSet chimneyFanBoostTimeSet(Map arg0=null)
    abstract ChimneyFanDefaultSet chimneyFanDefaultSet(Map arg0=null)
    abstract ChimneyFanMinSpeedGet chimneyFanMinSpeedGet(Map arg0=null)
    abstract ChimneyFanMinSpeedReport chimneyFanMinSpeedReport(Map arg0=null)
    abstract ChimneyFanMinSpeedSet chimneyFanMinSpeedSet(Map arg0=null)
    abstract ChimneyFanModeGet chimneyFanModeGet(Map arg0=null)
    abstract ChimneyFanModeReport chimneyFanModeReport(Map arg0=null)
    abstract ChimneyFanModeSet chimneyFanModeSet(Map arg0=null)
    abstract ChimneyFanSetupGet chimneyFanSetupGet(Map arg0=null)
    abstract ChimneyFanSetupReport chimneyFanSetupReport(Map arg0=null)
    abstract ChimneyFanSetupSet chimneyFanSetupSet(Map arg0=null)
    abstract ChimneyFanSpeedGet chimneyFanSpeedGet(Map arg0=null)
    abstract ChimneyFanSpeedReport chimneyFanSpeedReport(Map arg0=null)
    abstract ChimneyFanSpeedSet chimneyFanSpeedSet(Map arg0=null)
    abstract ChimneyFanStartTempGet chimneyFanStartTempGet(Map arg0=null)
    abstract ChimneyFanStartTempReport chimneyFanStartTempReport(Map arg0=null)
    abstract ChimneyFanStartTempSet chimneyFanStartTempSet(Map arg0=null)
    abstract ChimneyFanStateGet chimneyFanStateGet(Map arg0=null)
    abstract ChimneyFanStateReport chimneyFanStateReport(Map arg0=null)
    abstract ChimneyFanStateSet chimneyFanStateSet(Map arg0=null)
    abstract ChimneyFanStatusGet chimneyFanStatusGet(Map arg0=null)
    abstract ChimneyFanStatusReport chimneyFanStatusReport(Map arg0=null)
    abstract ChimneyFanStopTempGet chimneyFanStopTempGet(Map arg0=null)
    abstract ChimneyFanStopTempReport chimneyFanStopTempReport(Map arg0=null)
    abstract ChimneyFanStopTempSet chimneyFanStopTempSet(Map arg0=null)
    abstract ChimneyFanStopTimeGet chimneyFanStopTimeGet(Map arg0=null)
    abstract ChimneyFanStopTimeReport chimneyFanStopTimeReport(Map arg0=null)
    abstract ChimneyFanStopTimeSet chimneyFanStopTimeSet(Map arg0=null)
}
