package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlSetpointGet implements Command
{
    Short setpointType
    static short SETPOINT_TYPE_AUTO = 3
    static short SETPOINT_TYPE_DEHUMIDIFIER = 2
    static short SETPOINT_TYPE_HUMIDIFIER = 1
}