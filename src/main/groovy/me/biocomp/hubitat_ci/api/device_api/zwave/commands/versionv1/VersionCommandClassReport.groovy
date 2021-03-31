package me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait VersionCommandClassReport implements Command
{
    Short commandClassVersion
    Short requestedCommandClass
}