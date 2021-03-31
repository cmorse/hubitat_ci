package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlSetpointSupportedReport implements Command
{
    Boolean auto
    Short bitmask
    Boolean dehumidifier
    Boolean humidifier
}