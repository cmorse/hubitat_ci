package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1.TariffTblRemove
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1.TariffTblSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1.TariffTblSupplierSet

trait TariffConfigV1
{
    abstract TariffTblRemove tariffTblRemove(Map arg0=null)
    abstract TariffTblSet tariffTblSet(Map arg0=null)
    abstract TariffTblSupplierSet tariffTblSupplierSet(Map arg0=null)
}
