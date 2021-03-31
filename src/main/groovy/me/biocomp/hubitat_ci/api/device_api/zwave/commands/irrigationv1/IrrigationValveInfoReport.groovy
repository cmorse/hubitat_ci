package me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IrrigationValveInfoReport implements Command
{
    Boolean connected
    Boolean master
    Short nominalCurrent
    Short valveErrorStatus
    Short valveID
    static short VALVE_ERROR_CURRENT_HIGH_THRESHOLD = 1
    static short VALVE_ERROR_CURRENT_LOW_THRESHOLD = 2
    static short VALVE_ERROR_FLOW_HIGH_THRESHOLD = 4
    static short VALVE_ERROR_FLOW_LOW_THRESHOLD = 5
    static short VALVE_ERROR_MAXIMUM_FLOW = 3
    static short VALVE_ERROR_SHORT_CIRCUIT = 0
}