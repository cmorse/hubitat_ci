package me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait KexSet implements Command
{
    Boolean echo
    Boolean requestCSA
    Short requestedKeys
    Short supportedProfiles
    Short supportedSchemes
}