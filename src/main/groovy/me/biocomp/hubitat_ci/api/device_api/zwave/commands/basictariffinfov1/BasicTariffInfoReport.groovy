package me.biocomp.hubitat_ci.api.device_api.zwave.commands.basictariffinfov1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait BasicTariffInfoReport implements Command
{
    Boolean dual
    Short e1CurrentRateInUse
    Integer e1RateConsumptionRegister
    Short e1TimeForNextRateHours
    Short e1TimeForNextRateMinutes
    Short e1TimeForNextRateSeconds
    Short e2CurrentRateInUse
    Integer e2RateConsumptionRegister
    Short totalNoImportRates
}