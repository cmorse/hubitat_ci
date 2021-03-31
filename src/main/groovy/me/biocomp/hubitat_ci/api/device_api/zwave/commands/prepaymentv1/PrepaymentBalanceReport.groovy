package me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PrepaymentBalanceReport implements Command
{
    Short balancePrecision
    Short balanceType
    Integer balanceValue
    Integer currency
    Integer debt
    Short debtPrecision
    Short debtRecoveryPercentage
    Integer emerCredit
    Short emerCreditPrecision
    Short meterType
    Short scale
}