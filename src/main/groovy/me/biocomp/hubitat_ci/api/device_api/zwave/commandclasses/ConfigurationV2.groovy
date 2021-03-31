package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationBulkGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationBulkReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationBulkSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationSet

trait ConfigurationV2
{
    abstract ConfigurationBulkGet configurationBulkGet(Map arg0=null)
    abstract ConfigurationBulkReport configurationBulkReport(Map arg0=null)
    abstract ConfigurationBulkSet configurationBulkSet(Map arg0=null)
    abstract ConfigurationGet configurationGet(Map arg0=null)
    abstract ConfigurationReport configurationReport(Map arg0=null)
    abstract ConfigurationSet configurationSet(Map arg0=null)
}
