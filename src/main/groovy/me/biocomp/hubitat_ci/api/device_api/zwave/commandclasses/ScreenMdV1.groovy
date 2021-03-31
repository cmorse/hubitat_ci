package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv1.ScreenMdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv1.ScreenMdReport

trait ScreenMdV1
{
    abstract ScreenMdGet screenMdGet(Map arg0=null)
    abstract ScreenMdReport screenMdReport(Map arg0=null)
}
