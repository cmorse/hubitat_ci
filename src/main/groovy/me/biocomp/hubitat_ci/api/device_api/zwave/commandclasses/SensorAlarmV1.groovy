package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1.SensorAlarmGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1.SensorAlarmReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1.SensorAlarmSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1.SensorAlarmSupportedReport

trait SensorAlarmV1
{
    abstract SensorAlarmGet sensorAlarmGet(Map arg0=null)
    abstract SensorAlarmReport sensorAlarmReport(Map arg0=null)
    abstract SensorAlarmSupportedGet sensorAlarmSupportedGet(Map arg0=null)
    abstract SensorAlarmSupportedReport sensorAlarmSupportedReport(Map arg0=null)
}
