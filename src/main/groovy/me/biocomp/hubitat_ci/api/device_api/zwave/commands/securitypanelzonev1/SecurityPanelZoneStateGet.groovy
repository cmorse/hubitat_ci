package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityPanelZoneStateGet implements Command
{
    Short zoneNumber
}