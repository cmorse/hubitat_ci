package me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait VersionReport implements Command
{
    Short applicationSubVersion
    Short applicationVersion
    Short firmware0SubVersion
    Short firmware0Version
    Short firmwareTargets
    Short hardwareVersion
    List targetVersions
    Short zWaveLibraryType
    Short zWaveProtocolSubVersion
    Short zWaveProtocolVersion
}