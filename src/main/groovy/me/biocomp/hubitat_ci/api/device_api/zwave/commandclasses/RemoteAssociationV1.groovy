package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationv1.RemoteAssociationConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationv1.RemoteAssociationConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationv1.RemoteAssociationConfigurationSet

trait RemoteAssociationV1
{
    abstract RemoteAssociationConfigurationGet remoteAssociationConfigurationGet(Map arg0=null)
    abstract RemoteAssociationConfigurationReport remoteAssociationConfigurationReport(Map arg0=null)
    abstract RemoteAssociationConfigurationSet remoteAssociationConfigurationSet(Map arg0=null)
}
