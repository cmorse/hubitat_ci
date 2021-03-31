package me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HrvStatusSupportedReport implements Command
{
    Boolean dischargeAirTemperature
    Boolean exhaustAirTemperature
    Boolean outdoorAirTemperature
    Boolean relativeHumidityInRoom
    Boolean remainingFilterLife
    Boolean roomTemperature
    Boolean supplyAirTemperature
}