package me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait Security2NonceReport implements Command
{
    Boolean mOS
    List rEI
    Boolean sOS
    Short sequenceNumber
}