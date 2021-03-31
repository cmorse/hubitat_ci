package me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScheduleSupportedReport implements Command
{
    Boolean fallbackSupport
    Short numberOfSupportedCc
    Short numberOfSupportedScheduleId
    Boolean overrideSupport
    Short startTimeSupport
    Boolean supportEnabledisable
    Short supportedOverrideTypes
}