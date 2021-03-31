package me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScreenMdGet implements Command
{
    Short nodeId
    Short numberOfReports
}