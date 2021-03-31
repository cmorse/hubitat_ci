package me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ThermostatOperatingLoggingSupportedReport implements Command
{
    Boolean auxHeating
    Boolean cooling
    Boolean fanOnly
    Boolean heating
    Boolean idle
    Boolean pendingCool
    Boolean pendingHeat
    Boolean secondStageCooling
    Boolean secondStageHeating
    Boolean venteconomizer
}