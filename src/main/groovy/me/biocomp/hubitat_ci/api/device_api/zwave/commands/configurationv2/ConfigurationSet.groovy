package me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ConfigurationSet implements Command
{
    List configurationValue
    Boolean defaultValue
    Short parameterNumber
    Short reserved11
    java.math.BigInteger scaledConfigurationValue
    Short size
}