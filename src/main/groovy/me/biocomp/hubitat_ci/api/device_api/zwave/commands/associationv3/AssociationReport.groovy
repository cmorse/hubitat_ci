package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AssociationReport implements Command
{
    Short groupingIdentifier
    Short maxNodesSupported
    List nodeId
    Short reportsToFollow
}