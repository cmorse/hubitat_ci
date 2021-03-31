package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv1.AlarmGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv1.AlarmReport

trait AlarmV1
{
    abstract AlarmGet alarmGet(Map arg0=null)
    abstract AlarmReport alarmReport(Map arg0=null)
}
