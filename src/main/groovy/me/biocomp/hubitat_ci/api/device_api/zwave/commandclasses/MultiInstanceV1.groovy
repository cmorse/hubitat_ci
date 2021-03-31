package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstancev1.MultiInstanceCmdEncap
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstancev1.MultiInstanceGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstancev1.MultiInstanceReport

trait MultiInstanceV1
{
    abstract MultiInstanceCmdEncap multiInstanceCmdEncap(Map arg0=null)
    abstract MultiInstanceGet multiInstanceGet(Map arg0=null)
    abstract MultiInstanceReport multiInstanceReport(Map arg0=null)
}
