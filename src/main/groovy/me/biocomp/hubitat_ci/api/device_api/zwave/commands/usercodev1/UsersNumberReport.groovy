package me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait UsersNumberReport implements Command
{
    Short supportedUsers
}