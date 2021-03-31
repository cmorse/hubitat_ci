package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecurityMessageEncapsulationNonceGet implements Command
{
    List commandByte
    Short commandClassIdentifier
    Short commandIdentifier
    List initializationVector
    List messageAuthenticationCode
    Short receiversNonceIdentifier
    Boolean secondFrame
    Short sequenceCounter
    Boolean sequenced
}