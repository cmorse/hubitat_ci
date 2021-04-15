package me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait WakeUpIntervalCapabilitiesReport implements Command
{
    Integer defaultWakeUpIntervalSeconds
    Integer maximumWakeUpIntervalSeconds
    Integer minimumWakeUpIntervalSeconds
    Integer wakeUpIntervalStepSeconds
}