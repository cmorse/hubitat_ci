package me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SupervisionGet implements Command
{
    List commandByte
    Short commandClassIdentifier
    Short commandIdentifier
    Short commandLength
    Short sessionID
    Boolean statusUpdates
    abstract SupervisionGet encapsulate(Command arg0)
    abstract Command encapsulatedCommand(Map arg0)
}