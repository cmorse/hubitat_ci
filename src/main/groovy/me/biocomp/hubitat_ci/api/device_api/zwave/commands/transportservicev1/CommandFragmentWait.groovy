package me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandFragmentWait implements Command
{
    Short pendingFragments
}