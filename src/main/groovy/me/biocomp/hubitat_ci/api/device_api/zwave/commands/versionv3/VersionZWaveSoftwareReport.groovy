package me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait VersionZWaveSoftwareReport implements Command
{
    Integer applicationBuild
    Integer applicationVersion
    Integer frameworkBuild
    Integer frameworkVersion
    Integer interfaceBuild
    Integer interfaceVersion
    Integer protocolBuild
    Integer protocolVersion
    Integer sdkVersion
}