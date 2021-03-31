package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandConfigurationReport implements Command
{
    List commandByte
    Short commandClassIdentifier
    Short commandIdentifier
    Short commandLength
    Boolean first
    Short groupingIdentifier
    Short nodeId
    Short reportsToFollow
}