package me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HrvStatusGet implements Command
{
    Short statusParameter
    static Short STATUS_PARAMETER_DISCHARGE_AIR_TEMPERATURE = 3
    static Short STATUS_PARAMETER_EXHAUST_AIR_TEMPERATURE = 2
    static Short STATUS_PARAMETER_OUTDOOR_AIR_TEMPERATURE = 0
    static Short STATUS_PARAMETER_RELATIVE_HUMIDITY_IN_ROOM = 5
    static Short STATUS_PARAMETER_REMAINING_FILTER_LIFE = 6
    static Short STATUS_PARAMETER_ROOM_TEMPERATURE = 4
    static Short STATUS_PARAMETER_SUPPLY_AIR_TEMPERATURE = 1
}