package me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SimpleAvControlSet implements Command
{
    List commands
    Integer itemId
    Short keyAttributes
    Short sequenceNumber
}