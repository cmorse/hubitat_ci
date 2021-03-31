package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchAllSet implements Command
{
    Short mode
    static Short MODE_EXCLUDED_FROM_THE_ALL_OFF_FUNCTIONALITY_BUT_NOT_ALL_ON = 2
    static Short MODE_EXCLUDED_FROM_THE_ALL_ON_ALL_OFF_FUNCTIONALITY = 0
    static Short MODE_EXCLUDED_FROM_THE_ALL_ON_FUNCTIONALITY_BUT_NOT_ALL_OFF = 1
    static Short MODE_INCLUDED_IN_THE_ALL_ON_ALL_OFF_FUNCTIONALITY = 255
}