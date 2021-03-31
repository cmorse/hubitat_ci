package me.biocomp.hubitat_ci.api.device_api.zwave.commands.proprietaryv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ProprietaryReport implements Command
{
    List data
}