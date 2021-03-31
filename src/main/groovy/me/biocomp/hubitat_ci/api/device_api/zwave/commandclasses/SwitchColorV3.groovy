package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorStartLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorStopLevelChange
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorSupportedReport

trait SwitchColorV3
{
    abstract SwitchColorGet switchColorGet(Map arg0)
    abstract SwitchColorReport switchColorReport()
    abstract SwitchColorSet switchColorSet(Map arg0)
    abstract SwitchColorStartLevelChange switchColorStartLevelChange(Map arg0)
    abstract SwitchColorStopLevelChange switchColorStopLevelChange(Map arg0)
    abstract SwitchColorSupportedGet switchColorSupportedGet()
    abstract SwitchColorSupportedReport switchColorSupportedReport()
}
