package me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterTblStatusSupportedReport implements Command
{
    Short statusEventLogDepth
    Integer supportedOperatingStatus
}