package me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PrepaymentBalanceGet implements Command
{
    Short balanceType
    static Short BALANCE_TYPE_MONETARY = 1
    static Short BALANCE_TYPE_UTILITY = 0
}