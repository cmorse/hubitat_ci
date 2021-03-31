package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.deviceresetlocallyv1.DeviceResetLocallyNotification

trait DeviceResetLocallyV1
{
    abstract DeviceResetLocallyNotification deviceResetLocallyNotification(Map arg0=null)
}
