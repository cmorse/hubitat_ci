package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationRelease
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationRenew
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationSet

trait IpConfigurationV1
{
    abstract IpConfigurationGet ipConfigurationGet(Map arg0=null)
    abstract IpConfigurationRelease ipConfigurationRelease(Map arg0=null)
    abstract IpConfigurationRenew ipConfigurationRenew(Map arg0=null)
    abstract IpConfigurationReport ipConfigurationReport(Map arg0=null)
    abstract IpConfigurationSet ipConfigurationSet(Map arg0=null)
}
