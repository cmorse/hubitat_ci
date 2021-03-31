package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxAddressGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxAddressReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxAddressSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxCapabilityGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxCapabilityReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxData

trait DmxV1
{
    abstract DmxAddressGet dmxAddressGet(Map arg0=null)
    abstract DmxAddressReport dmxAddressReport(Map arg0=null)
    abstract DmxAddressSet dmxAddressSet(Map arg0=null)
    abstract DmxCapabilityGet dmxCapabilityGet(Map arg0=null)
    abstract DmxCapabilityReport dmxCapabilityReport(Map arg0=null)
    abstract DmxData dmxData(Map arg0=null)
}
