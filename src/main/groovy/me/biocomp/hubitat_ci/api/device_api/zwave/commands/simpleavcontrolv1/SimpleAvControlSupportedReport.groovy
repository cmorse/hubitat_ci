package me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SimpleAvControlSupportedReport implements Command
{
    List bitMasks
    Short reportNo
}