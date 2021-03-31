package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelAssociationGet implements Command
{
    Short groupingIdentifier
}