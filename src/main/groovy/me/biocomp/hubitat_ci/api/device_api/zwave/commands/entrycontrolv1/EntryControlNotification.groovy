package me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait EntryControlNotification implements Command
{
    Short dataType
    List eventData
    Short eventType
    Short sequenceNumber
    static Short DATA_TYPE_ASCII = 2
    static Short DATA_TYPE_MD5 = 3
    static Short DATA_TYPE_NA = 0
    static Short DATA_TYPE_RAW = 1
    static Short EVENT_TYPE_ALERT_MEDICAL = 19
    static Short EVENT_TYPE_ALERT_PANIC = 18
    static Short EVENT_TYPE_ARM_1 = 8
    static Short EVENT_TYPE_ARM_2 = 9
    static Short EVENT_TYPE_ARM_3 = 10
    static Short EVENT_TYPE_ARM_4 = 11
    static Short EVENT_TYPE_ARM_5 = 12
    static Short EVENT_TYPE_ARM_6 = 13
    static Short EVENT_TYPE_ARM_ALL = 4
    static Short EVENT_TYPE_ARM_AWAY = 5
    static Short EVENT_TYPE_ARM_HOME = 6
    static Short EVENT_TYPE_BELL = 15
    static Short EVENT_TYPE_CACHED_KEYS = 1
    static Short EVENT_TYPE_CACHING = 0
    static Short EVENT_TYPE_CANCEL = 25
    static Short EVENT_TYPE_DISARM_ALL = 3
    static Short EVENT_TYPE_ENTER = 2
    static Short EVENT_TYPE_EXIT_DELAY = 7
    static Short EVENT_TYPE_FIRE = 16
    static Short EVENT_TYPE_GATE_CLOSE = 21
    static Short EVENT_TYPE_GATE_OPEN = 20
    static Short EVENT_TYPE_LOCK = 22
    static Short EVENT_TYPE_POLICE = 17
    static Short EVENT_TYPE_RFID = 14
    static Short EVENT_TYPE_TEST = 24
    static Short EVENT_TYPE_UNLOCK = 23
}