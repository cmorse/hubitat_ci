package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontroloperatingstatev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlOperatingStateReport implements Command
{
    Short operatingState
    static short OPERATING_STATE_DEHUMIDIFYING = 2
    static short OPERATING_STATE_HUMIDIFYING = 1
    static short OPERATING_STATE_IDLE = 0
}