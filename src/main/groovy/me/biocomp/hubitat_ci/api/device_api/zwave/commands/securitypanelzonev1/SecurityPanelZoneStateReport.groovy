package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityPanelZoneStateReport implements Command
{
    Short zoneNumber
    Short zoneState
}