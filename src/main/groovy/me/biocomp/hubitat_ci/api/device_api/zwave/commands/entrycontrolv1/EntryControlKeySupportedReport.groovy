package me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait EntryControlKeySupportedReport implements Command
{
    Short bitMaskLength
    List bitmask
}