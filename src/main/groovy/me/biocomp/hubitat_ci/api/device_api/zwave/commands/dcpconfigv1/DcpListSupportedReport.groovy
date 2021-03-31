package me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DcpListSupportedReport implements Command
{
    Short dcpListSize
    Short freeDcpListEntries
}