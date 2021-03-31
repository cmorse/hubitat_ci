package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv2.ScreenMdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv2.ScreenMdReport

trait ScreenMdV2
{
    abstract ScreenMdGet screenMdGet(Map arg0=null)
    abstract ScreenMdReport screenMdReport(Map arg0=null)
}
