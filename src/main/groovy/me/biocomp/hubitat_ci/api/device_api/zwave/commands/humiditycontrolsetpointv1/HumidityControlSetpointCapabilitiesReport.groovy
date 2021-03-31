package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlSetpointCapabilitiesReport implements Command
{
    Short maximumPrecision
    Short maximumScale
    BigDecimal maximumScaledValue
    Short maximumSize
    List maximumValue
    Short minimumPrecision
    Short minimumScale
    BigDecimal minimumScaledValue
    Short minimumSize
    List minimumValue
    Short setpointType
    static short SCALE_ABSOLUTE = 1
    static short SCALE_PERCENTAGE = 0
    static short SETPOINT_TYPE_DEHUMIDIFIER = 2
    static short SETPOINT_TYPE_HUMIDIFIER = 1
}