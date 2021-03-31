package me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CentralSceneSupportedReport implements Command
{
    Boolean identical
    Boolean slowRefresh
    List supportedKeyAttributes
    Short supportedScenes
}