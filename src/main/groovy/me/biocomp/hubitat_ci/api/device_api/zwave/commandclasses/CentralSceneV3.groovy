package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneConfigurationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneNotification
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneSupportedReport

trait CentralSceneV3
{
    abstract CentralSceneConfigurationGet centralSceneConfigurationGet(Map arg0=null)
    abstract CentralSceneConfigurationReport centralSceneConfigurationReport(Map arg0=null)
    abstract CentralSceneConfigurationSet centralSceneConfigurationSet(Map arg0=null)
    abstract CentralSceneNotification centralSceneNotification(Map arg0=null)
    abstract CentralSceneSupportedGet centralSceneSupportedGet(Map arg0=null)
    abstract CentralSceneSupportedReport centralSceneSupportedReport(Map arg0=null)
}
