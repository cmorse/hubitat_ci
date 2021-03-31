package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlSetpointScaleSupportedReport implements Command
{
    Boolean absolute
    Boolean percentage
    Short scaleBitmask
}