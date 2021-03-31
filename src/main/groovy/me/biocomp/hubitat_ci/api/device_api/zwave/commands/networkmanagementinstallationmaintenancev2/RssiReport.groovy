package me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait RssiReport implements Command
{
    Short channel1
    Short channel2
    Short channel3
    static Short RSSI_BELOW_SENSITIVITY = 125
    static Short RSSI_MAX_POWER_SATURATED = 126
    static Short RSSI_NOT_AVAILABLE = 127
}