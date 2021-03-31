package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlConfigurationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlEventSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlEventSupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlKeySupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlKeySupportedReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlNotification

trait EntryControlV1
{
    abstract EntryControlConfigurationGet entryControlConfigurationGet()
    abstract EntryControlConfigurationReport entryControlConfigurationReport(Map arg0=null)
    abstract EntryControlConfigurationSet entryControlConfigurationSet(Map arg0=null)
    abstract EntryControlEventSupportedGet entryControlEventSupportedGet()
    abstract EntryControlEventSupportedReport entryControlEventSupportedReport(Map arg0=null)
    abstract EntryControlKeySupportedGet entryControlKeySupportedGet()
    abstract EntryControlKeySupportedReport entryControlKeySupportedReport(Map arg0=null)
    abstract EntryControlNotification entryControlNotification(Map arg0=null)
}
