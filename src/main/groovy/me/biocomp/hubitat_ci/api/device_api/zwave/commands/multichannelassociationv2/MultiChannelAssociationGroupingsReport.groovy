package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelAssociationGroupingsReport implements Command
{
    Short supportedGroupings
}