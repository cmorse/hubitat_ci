package me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait EventSupportedGet implements Command
{
    Short notificationType
    static Short NOTIFICATION_TYPE_ACCESS_CONTROL = 6
    static Short NOTIFICATION_TYPE_APPLIANCE = 12
    static Short NOTIFICATION_TYPE_BURGLAR = 7
    static Short NOTIFICATION_TYPE_CLOCK = 11
    static Short NOTIFICATION_TYPE_CO = 2
    static Short NOTIFICATION_TYPE_CO2 = 3
    static Short NOTIFICATION_TYPE_EMERGENCY = 10
    static Short NOTIFICATION_TYPE_FIRST = 255
    static Short NOTIFICATION_TYPE_HEAT = 4
    static Short NOTIFICATION_TYPE_HOME_HEALTH = 13
    static Short NOTIFICATION_TYPE_POWER_MANAGEMENT = 8
    static Short NOTIFICATION_TYPE_RESERVED0 = 0
    static Short NOTIFICATION_TYPE_SIREN = 14
    static Short NOTIFICATION_TYPE_SMOKE = 1
    static Short NOTIFICATION_TYPE_SYSTEM = 9
    static Short NOTIFICATION_TYPE_WATER = 5
}