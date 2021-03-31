package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityPanelZoneSupportedReport implements Command
{
    Boolean zm
    Short zonesSupported
}