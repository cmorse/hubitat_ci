package me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterTblStatusDepthGet implements Command
{
    Short statusEventLogDepth
}