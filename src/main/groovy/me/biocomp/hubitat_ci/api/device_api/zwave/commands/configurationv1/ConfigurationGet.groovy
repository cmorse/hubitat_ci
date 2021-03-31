package me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ConfigurationGet implements Command
{
    Short parameterNumber
}