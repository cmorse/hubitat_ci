package me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait EntryControlConfigurationReport implements Command
{
    Short keyCacheSize
    Short keyCacheTimeout
}