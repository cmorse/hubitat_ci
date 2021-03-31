package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelAssociationGet implements Command
{
    Short groupingIdentifier
}