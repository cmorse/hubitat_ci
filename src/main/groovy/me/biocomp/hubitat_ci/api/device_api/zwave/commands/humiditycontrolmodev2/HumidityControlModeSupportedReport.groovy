package me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HumidityControlModeSupportedReport implements Command
{
    Short bitmask
    Boolean modeAuto
    Boolean modeDehumidify
    Boolean modeHumidify
    Boolean modeOff
}