package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UserCodeGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UserCodeReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UserCodeSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UsersNumberGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UsersNumberReport

trait UserCodeV1
{
    abstract UserCodeGet userCodeGet(Map arg0=null)
    abstract UserCodeReport userCodeReport(Map arg0=null)
    abstract UserCodeSet userCodeSet(Map arg0=null)
    abstract UsersNumberGet usersNumberGet(Map arg0=null)
    abstract UsersNumberReport usersNumberReport(Map arg0=null)
}
