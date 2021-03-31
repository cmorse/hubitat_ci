package me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait WakeUpIntervalSet implements Command
{
    Short nodeid
    Integer seconds
}