package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandConfigurationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandRecordsSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandRecordsSupportedReport

trait AssociationCommandConfigurationV1
{
    abstract CommandConfigurationGet commandConfigurationGet(Map arg0=null)
    abstract CommandConfigurationReport commandConfigurationReport(Map arg0=null)
    abstract CommandConfigurationSet commandConfigurationSet(Map arg0=null)
    abstract CommandRecordsSupportedGet commandRecordsSupportedGet(Map arg0=null)
    abstract CommandRecordsSupportedReport commandRecordsSupportedReport(Map arg0=null)
}
