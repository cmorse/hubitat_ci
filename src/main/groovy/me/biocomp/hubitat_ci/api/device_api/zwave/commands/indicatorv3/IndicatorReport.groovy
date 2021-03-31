package me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait IndicatorReport implements Command
{
    Short indicatorCount
    List indicatorValues
    Short value
    static Short INDICATOR_TYPE_ALARM = 12
    static Short INDICATOR_TYPE_ALARM_BURGLAR = 13
    static Short INDICATOR_TYPE_ALARM_CO = 15
    static Short INDICATOR_TYPE_ALARM_SMOKE = 14
    static Short INDICATOR_TYPE_ARMED = 1
    static Short INDICATOR_TYPE_ARMED_AWAY = 11
    static Short INDICATOR_TYPE_ARMED_STAY = 10
    static Short INDICATOR_TYPE_ARMED_ZONE_1 = 32
    static Short INDICATOR_TYPE_ARMED_ZONE_2 = 33
    static Short INDICATOR_TYPE_ARMED_ZONE_3 = 34
    static Short INDICATOR_TYPE_ARMED_ZONE_4 = 35
    static Short INDICATOR_TYPE_ARMED_ZONE_5 = 36
    static Short INDICATOR_TYPE_ARMED_ZONE_6 = 37
    static Short INDICATOR_TYPE_BACKLIGHT_COMMANDS = 66
    static Short INDICATOR_TYPE_BACKLIGHT_DIGITS = 65
    static Short INDICATOR_TYPE_BACKLIGHT_LCD = 48
    static Short INDICATOR_TYPE_BACKLIGHT_LETTERS = 64
    static Short INDICATOR_TYPE_BUSY = 5
    static Short INDICATOR_TYPE_BUZZER = 240
    static Short INDICATOR_TYPE_BYPASS_CHALLENGE = 16
    static Short INDICATOR_TYPE_CODE_ACCEPTED = 8
    static Short INDICATOR_TYPE_CODE_REJECTED = 9
    static Short INDICATOR_TYPE_DISARMED = 2
    static Short INDICATOR_TYPE_ENTER_ID = 6
    static Short INDICATOR_TYPE_ENTER_PIN = 7
    static Short INDICATOR_TYPE_ENTRY_DELAY = 17
    static Short INDICATOR_TYPE_EXIT_DELAY = 18
    static Short INDICATOR_TYPE_FAULT = 4
    static Short INDICATOR_TYPE_IDENTIFY = 80
    static Short INDICATOR_TYPE_INDICATION_BUTTON_1 = 67
    static Short INDICATOR_TYPE_INDICATION_BUTTON_10 = 76
    static Short INDICATOR_TYPE_INDICATION_BUTTON_11 = 77
    static Short INDICATOR_TYPE_INDICATION_BUTTON_12 = 78
    static Short INDICATOR_TYPE_INDICATION_BUTTON_2 = 68
    static Short INDICATOR_TYPE_INDICATION_BUTTON_3 = 69
    static Short INDICATOR_TYPE_INDICATION_BUTTON_4 = 70
    static Short INDICATOR_TYPE_INDICATION_BUTTON_5 = 71
    static Short INDICATOR_TYPE_INDICATION_BUTTON_6 = 72
    static Short INDICATOR_TYPE_INDICATION_BUTTON_7 = 73
    static Short INDICATOR_TYPE_INDICATION_BUTTON_8 = 74
    static Short INDICATOR_TYPE_INDICATION_BUTTON_9 = 75
    static Short INDICATOR_TYPE_READY = 3
    static Short INDICATOR_TYPE_RESERVED = 0
}