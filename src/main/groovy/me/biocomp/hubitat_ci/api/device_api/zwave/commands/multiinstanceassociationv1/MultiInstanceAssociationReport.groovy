package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiInstanceAssociationReport implements Command
{
    Short groupingIdentifier
    Short maxNodesSupported
    List nodeId
    Short reportsToFollow
}