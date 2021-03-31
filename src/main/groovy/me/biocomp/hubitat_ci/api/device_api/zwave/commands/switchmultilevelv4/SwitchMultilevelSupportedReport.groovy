package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchMultilevelSupportedReport implements Command
{
    Short primarySwitchType
    Short secondarySwitchType
}