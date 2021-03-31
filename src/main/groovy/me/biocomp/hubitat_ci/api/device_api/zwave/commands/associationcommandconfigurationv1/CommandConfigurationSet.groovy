package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandConfigurationSet implements Command
{
    List commandByte
    Short commandClassIdentifier
    Short commandIdentifier
    Short commandLength
    Short groupingIdentifier
    Short nodeId
}