package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.languagev1.LanguageGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.languagev1.LanguageReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.languagev1.LanguageSet

trait LanguageV1
{
    abstract LanguageGet languageGet(Map arg0=null)
    abstract LanguageReport languageReport(Map arg0=null)
    abstract LanguageSet languageSet(Map arg0=null)
}
