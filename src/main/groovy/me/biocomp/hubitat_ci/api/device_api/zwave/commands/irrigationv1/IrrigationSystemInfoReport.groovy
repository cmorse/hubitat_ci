package me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IrrigationSystemInfoReport implements Command
{
    Boolean masterValve
    Short totalNumberOfValveTables
    Short totalNumberOfValves
    Short valveTableMaxSize
}