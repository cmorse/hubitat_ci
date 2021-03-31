package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmTypeSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmTypeSupportedReport

trait AlarmV2
{
    abstract AlarmGet alarmGet(Map arg0=null)
    abstract AlarmReport alarmReport(Map arg0=null)
    abstract AlarmSet alarmSet(Map arg0=null)
    abstract AlarmTypeSupportedGet alarmTypeSupportedGet(Map arg0=null)
    abstract AlarmTypeSupportedReport alarmTypeSupportedReport(Map arg0=null)
}
