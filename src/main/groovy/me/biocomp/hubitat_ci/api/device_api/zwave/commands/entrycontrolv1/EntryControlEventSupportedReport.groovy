package me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait EntryControlEventSupportedReport implements Command
{
    List dataTypeSupportedBitMask
    List eventTypeSupportedBitMask
    Integer keyCachedSizeMax
    Integer keyCachedTimeoutMax
}