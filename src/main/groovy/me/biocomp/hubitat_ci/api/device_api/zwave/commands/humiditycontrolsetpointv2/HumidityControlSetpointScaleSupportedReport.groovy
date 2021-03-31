package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlSetpointScaleSupportedReport implements Command
{
    Boolean absolute
    Boolean percentage
    Short scaleBitmask
    static short SETPOINT_TYPE_AUTO = 3
}