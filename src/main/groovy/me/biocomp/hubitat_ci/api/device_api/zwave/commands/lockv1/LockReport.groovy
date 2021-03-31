package me.biocomp.hubitat_ci.api.device_api.zwave.commands.lockv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait LockReport implements Command
{
    Short lockState
}