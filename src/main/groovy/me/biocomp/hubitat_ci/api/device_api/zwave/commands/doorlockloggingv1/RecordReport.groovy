package me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RecordReport implements Command
{
    Short day
    Short eventType
    Short hourLocalTime
    Short minuteLocalTime
    Short month
    Short recordNumber
    Short recordStatus
    Short secondLocalTime
    List userCode
    Short userCodeLength
    Short userIdentifier
    Integer year
}