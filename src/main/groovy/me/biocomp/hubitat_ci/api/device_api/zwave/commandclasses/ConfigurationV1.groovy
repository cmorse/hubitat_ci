package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv1.ConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv1.ConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv1.ConfigurationSet

trait ConfigurationV1
{
    abstract ConfigurationGet configurationGet(Map arg0=null)
    abstract ConfigurationReport configurationReport(Map arg0=null)
    abstract ConfigurationSet configurationSet(Map arg0=null)
}
