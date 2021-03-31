package me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait VersionCommandClassGet implements Command
{
    Short requestedCommandClass
}