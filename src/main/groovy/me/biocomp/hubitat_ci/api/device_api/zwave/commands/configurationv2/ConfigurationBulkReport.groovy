package me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ConfigurationBulkReport implements Command
{
    Boolean defaultValue
    Boolean handshake
    Short numberOfParameters
    Integer parameterOffset
    Short reportsToFollow
    Short size
}