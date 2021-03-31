package me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScreenMdReport implements Command
{
    Short charPresentation
    Boolean moreData
    Short screenSettings
    Boolean screenTimeout
}