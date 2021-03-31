package me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CentralSceneSupportedReport implements Command
{
    Short supportedScenes
}