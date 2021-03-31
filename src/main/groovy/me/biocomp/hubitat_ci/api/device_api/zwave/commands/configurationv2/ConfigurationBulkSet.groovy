package me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ConfigurationBulkSet implements Command
{
    Boolean defaultValue
    Boolean handshake
    Short numberOfParameters
    Integer parameterOffset
    Short size
}