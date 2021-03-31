package me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait VersionCapabilitiesReport implements Command
{
    Boolean commandClass
    Boolean version
    Boolean zwaveSoftware
}