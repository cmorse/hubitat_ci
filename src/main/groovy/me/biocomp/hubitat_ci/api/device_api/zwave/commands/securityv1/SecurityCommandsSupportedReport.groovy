package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityCommandsSupportedReport implements Command
{
    List commandClassControl
    List commandClassSupport
    Short reportsToFollow
}