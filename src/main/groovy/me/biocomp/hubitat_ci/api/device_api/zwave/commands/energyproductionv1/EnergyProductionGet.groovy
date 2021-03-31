package me.biocomp.hubitat_ci.api.device_api.zwave.commands.energyproductionv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait EnergyProductionGet implements Command
{
    Short parameterNumber
    static Short PARAMETER_NUMBER_ENERGY_PRODUCTION_TODAY = 2
    static Short PARAMETER_NUMBER_INSTANT_ENERGY_PRODUCTION = 0
    static Short PARAMETER_NUMBER_TOTAL_ENERGY_PRODUCTION = 1
    static Short PARAMETER_NUMBER_TOTAL_PRODUCTION_TIME = 3
}