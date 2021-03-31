package me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ConfigurationBulkGet implements Command
{
    Short numberOfParameters
    Integer parameterOffset
}