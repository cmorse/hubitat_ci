package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.energyproductionv1.EnergyProductionGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.energyproductionv1.EnergyProductionReport

trait EnergyProductionV1
{
    abstract EnergyProductionGet energyProductionGet(Map arg0=null)
    abstract EnergyProductionReport energyProductionReport(Map arg0=null)
}
