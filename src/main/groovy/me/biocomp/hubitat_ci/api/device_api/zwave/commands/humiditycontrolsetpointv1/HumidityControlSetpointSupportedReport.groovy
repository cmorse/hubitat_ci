package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlSetpointSupportedReport implements Command
{
    Short bitmask
    Boolean dehumidifier
    Boolean humidifier
}