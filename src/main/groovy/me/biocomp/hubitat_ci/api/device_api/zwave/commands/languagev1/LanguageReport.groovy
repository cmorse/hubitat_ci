package me.biocomp.hubitat_ci.api.device_api.zwave.commands.languagev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait LanguageReport implements Command
{
    Integer country
    Integer language
}