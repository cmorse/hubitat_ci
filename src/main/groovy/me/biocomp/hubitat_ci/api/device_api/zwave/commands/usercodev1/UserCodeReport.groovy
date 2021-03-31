package me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait UserCodeReport implements Command
{
    String userCode
    Short userIdStatus
    Short userIdentifier
    static Short USER_ID_STATUS_AVAILABLE_NOT_SET = 0
    static Short USER_ID_STATUS_OCCUPIED = 1
    static Short USER_ID_STATUS_RESERVED_BY_ADMINISTRATOR = 2
    static Short USER_ID_STATUS_STATUS_NOT_AVAILABLE = 254
}