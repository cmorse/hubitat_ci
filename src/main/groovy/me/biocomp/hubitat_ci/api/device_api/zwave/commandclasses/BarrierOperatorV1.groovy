package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.barrieroperatorv1.BarrierOperatorGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.barrieroperatorv1.BarrierOperatorReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.barrieroperatorv1.BarrierOperatorSet

trait BarrierOperatorV1
{
    abstract BarrierOperatorGet barrierOperatorGet(Map arg0=null)
    abstract BarrierOperatorReport barrierOperatorReport(Map arg0=null)
    abstract BarrierOperatorSet barrierOperatorSet(Map arg0=null)
}
