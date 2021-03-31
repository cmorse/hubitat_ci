package me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait VersionReport implements Command
{
    Short applicationSubVersion
    Short applicationVersion
    Short zWaveLibraryType
    Short zWaveProtocolSubVersion
    Short zWaveProtocolVersion
}