package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.basictariffinfov1.BasicTariffInfoGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.basictariffinfov1.BasicTariffInfoReport

trait BasicTariffInfoV1
{
    abstract BasicTariffInfoGet basicTariffInfoGet(Map arg0=null)
    abstract BasicTariffInfoReport basicTariffInfoReport(Map arg0=null)
}
