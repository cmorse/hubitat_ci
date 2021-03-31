package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlSetpointSet implements Command
{
    Short precision
    Short scale
    BigDecimal scaledValue
    Short setpointType
    Short size
    List value
    static short SCALE_ABSOLUTE = 1
    static short SCALE_PERCENTAGE = 0
    static short SETPOINT_TYPE_DEHUMIDIFIER = 2
    static short SETPOINT_TYPE_HUMIDIFIER = 1
}