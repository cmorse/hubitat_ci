package me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ConfigurationReport implements Command
{
    List configurationValue
    Short parameterNumber
    java.math.BigInteger scaledConfigurationValue
    Short size
}