package me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CentralSceneSupportedReport implements Command
{
    Boolean identical
    List supportedKeyAttributes
    Short supportedScenes
}