package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorStartLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorStopLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorSupportedReport

trait SwitchColorV2
{
    abstract SwitchColorGet switchColorGet(Map arg0)
    abstract SwitchColorReport switchColorReport()
    abstract SwitchColorSet switchColorSet(Map arg0)
    abstract SwitchColorStartLevelChange switchColorStartLevelChange(Map arg0)
    abstract SwitchColorStopLevelChange switchColorStopLevelChange(Map arg0)
    abstract SwitchColorSupportedGet switchColorSupportedGet()
    abstract SwitchColorSupportedReport switchColorSupportedReport()
}
