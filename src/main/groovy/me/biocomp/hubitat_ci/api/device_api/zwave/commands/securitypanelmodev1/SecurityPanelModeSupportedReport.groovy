package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityPanelModeSupportedReport implements Command
{
    Integer supportedModeBitMask
}