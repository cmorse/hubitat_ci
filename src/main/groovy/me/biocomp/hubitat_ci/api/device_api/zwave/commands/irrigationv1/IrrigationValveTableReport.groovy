package me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IrrigationValveTableReport implements Command
{
    List valveTable
    Short valveTableID
}