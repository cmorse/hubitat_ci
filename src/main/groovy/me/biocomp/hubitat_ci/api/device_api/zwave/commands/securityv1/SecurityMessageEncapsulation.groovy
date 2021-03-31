package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityMessageEncapsulation implements Command
{
    List commandByte
    Short commandClassIdentifier
    Short commandIdentifier
    Boolean secondFrame
    Short sequenceCounter
    Boolean sequenced
    abstract SecurityMessageEncapsulation encapsulate(Command arg0)
    abstract Command encapsulatedCommand(Map arg0)
}