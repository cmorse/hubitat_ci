package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlModeSupportedReport implements Command
{
    Short bitmask
    Boolean modeDehumidify
    Boolean modeHumidify
    Boolean modeOff
}