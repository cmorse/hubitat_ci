package me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IpConfigurationReport implements Command
{
    Boolean autoDns
    Boolean autoIp
    Integer dns1
    Integer dns2
    Integer gateway
    Integer ipAddress
    Integer leasetime
    Integer subnetMask
}