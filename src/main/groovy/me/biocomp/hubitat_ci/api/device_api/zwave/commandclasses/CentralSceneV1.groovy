package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev1.CentralSceneNotification
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev1.CentralSceneSupportedGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev1.CentralSceneSupportedReport

trait CentralSceneV1
{
    abstract CentralSceneNotification centralSceneNotification(Map arg0=null)
    abstract CentralSceneSupportedGet centralSceneSupportedGet(Map arg0=null)
    abstract CentralSceneSupportedReport centralSceneSupportedReport(Map arg0=null)
}
