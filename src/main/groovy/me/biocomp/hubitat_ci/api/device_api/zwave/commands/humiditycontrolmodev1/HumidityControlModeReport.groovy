package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlModeReport implements Command
{
    Short mode
    static short MODE_DEHUMIDIFY = 2
    static short MODE_HUMIDIFY = 1
    static short MODE_OFF = 0
}