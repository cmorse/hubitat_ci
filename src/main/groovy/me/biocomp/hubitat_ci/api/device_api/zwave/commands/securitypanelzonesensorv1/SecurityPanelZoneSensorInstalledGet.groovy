package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityPanelZoneSensorInstalledGet implements Command
{
    Short zoneNumber
}