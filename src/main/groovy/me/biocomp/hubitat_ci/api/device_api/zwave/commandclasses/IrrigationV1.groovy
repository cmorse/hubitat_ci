package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemConfigGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemConfigReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemConfigSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemInfoGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemInfoReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemShutoff
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemStatusGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemStatusReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveConfigGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveConfigReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveConfigSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveInfoGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveInfoReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveRun
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveTableGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveTableReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveTableRun
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveTableSet

trait IrrigationV1
{
    abstract IrrigationSystemConfigGet irrigationSystemConfigGet(Map arg0=null)
    abstract IrrigationSystemConfigReport irrigationSystemConfigReport(Map arg0=null)
    abstract IrrigationSystemConfigSet irrigationSystemConfigSet(Map arg0=null)
    abstract IrrigationSystemInfoGet irrigationSystemInfoGet(Map arg0=null)
    abstract IrrigationSystemInfoReport irrigationSystemInfoReport(Map arg0=null)
    abstract IrrigationSystemShutoff irrigationSystemShutoff(Map arg0=null)
    abstract IrrigationSystemStatusGet irrigationSystemStatusGet(Map arg0=null)
    abstract IrrigationSystemStatusReport irrigationSystemStatusReport(Map arg0=null)
    abstract IrrigationValveConfigGet irrigationValveConfigGet(Map arg0=null)
    abstract IrrigationValveConfigReport irrigationValveConfigReport(Map arg0=null)
    abstract IrrigationValveConfigSet irrigationValveConfigSet(Map arg0=null)
    abstract IrrigationValveInfoGet irrigationValveInfoGet(Map arg0=null)
    abstract IrrigationValveInfoReport irrigationValveInfoReport(Map arg0=null)
    abstract IrrigationValveRun irrigationValveRun(Map arg0=null)
    abstract IrrigationValveTableGet irrigationValveTableGet(Map arg0=null)
    abstract IrrigationValveTableReport irrigationValveTableReport(Map arg0=null)
    abstract IrrigationValveTableRun irrigationValveTableRun(Map arg0=null)
    abstract IrrigationValveTableSet irrigationValveTableSet(Map arg0=null)
}
