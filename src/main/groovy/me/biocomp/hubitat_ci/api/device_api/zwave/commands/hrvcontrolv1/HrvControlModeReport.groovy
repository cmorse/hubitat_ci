package me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HrvControlModeReport implements Command
{
    Short mode
    static Short MODE_DEMAND_AUTOMATIC = 1
    static Short MODE_ENERGY_SAVINGS_MODE = 3
    static Short MODE_MANUAL = 4
    static Short MODE_OFF = 0
    static Short MODE_SCHEDULE = 2
}