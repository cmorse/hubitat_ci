package me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CentralSceneConfigurationSet implements Command
{
    Boolean slowRefresh
}