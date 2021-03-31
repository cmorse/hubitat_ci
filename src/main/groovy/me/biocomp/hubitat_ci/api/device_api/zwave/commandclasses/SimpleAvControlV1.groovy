package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlSupportedReport

trait SimpleAvControlV1
{
    abstract SimpleAvControlGet simpleAvControlGet(Map arg0=null)
    abstract SimpleAvControlReport simpleAvControlReport(Map arg0=null)
    abstract SimpleAvControlSet simpleAvControlSet(Map arg0=null)
    abstract SimpleAvControlSupportedGet simpleAvControlSupportedGet(Map arg0=null)
    abstract SimpleAvControlSupportedReport simpleAvControlSupportedReport(Map arg0=null)
}
