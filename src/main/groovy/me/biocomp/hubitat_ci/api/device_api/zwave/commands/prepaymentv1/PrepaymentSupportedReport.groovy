package me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PrepaymentSupportedReport implements Command
{
    Short typesSupported
}