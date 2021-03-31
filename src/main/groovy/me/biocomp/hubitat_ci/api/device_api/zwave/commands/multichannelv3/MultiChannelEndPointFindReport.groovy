package me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MultiChannelEndPointFindReport implements Command
{
    List endPoints
    Short genericDeviceClass
    Short reportsToFollow
    Short specificDeviceClass
}