package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblCostGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblCostReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblSupplierGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblSupplierReport

trait TariffTblMonitorV1
{
    abstract TariffTblCostGet tariffTblCostGet(Map arg0=null)
    abstract TariffTblCostReport tariffTblCostReport(Map arg0=null)
    abstract TariffTblGet tariffTblGet(Map arg0=null)
    abstract TariffTblReport tariffTblReport(Map arg0=null)
    abstract TariffTblSupplierGet tariffTblSupplierGet(Map arg0=null)
    abstract TariffTblSupplierReport tariffTblSupplierReport(Map arg0=null)
}
