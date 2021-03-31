package me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScreenMdReport implements Command
{
    Short charPresentation
    Boolean moreData
    Short screenSettings
}