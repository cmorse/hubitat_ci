package me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TariffTblSupplierSet implements Command
{
    Integer currency
    Short day
    Short hourLocalTime
    Short minuteLocalTime
    Short month
    Short numberOfSupplierCharacters
    Short secondLocalTime
    Short standingChargePeriod
    Short standingChargePrecision
    Integer standingChargeValue
    List supplierCharacter
    Integer year
}