package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.multicmdv1.MultiCmdEncap

trait MultiCmdV1
{
    abstract MultiCmdEncap multiCmdEncap(Map arg0=null)
}
