package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdByLetterGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdByLetterReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdChildCountGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdChildCountReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvMatchItemToRendererMdGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvMatchItemToRendererMdReport

trait AvContentDirectoryMdV1
{
    abstract AvContentBrowseMdByLetterGet avContentBrowseMdByLetterGet(Map arg0=null)
    abstract AvContentBrowseMdByLetterReport avContentBrowseMdByLetterReport(Map arg0=null)
    abstract AvContentBrowseMdChildCountGet avContentBrowseMdChildCountGet(Map arg0=null)
    abstract AvContentBrowseMdChildCountReport avContentBrowseMdChildCountReport(Map arg0=null)
    abstract AvContentBrowseMdGet avContentBrowseMdGet(Map arg0=null)
    abstract AvContentBrowseMdReport avContentBrowseMdReport(Map arg0=null)
    abstract AvMatchItemToRendererMdGet avMatchItemToRendererMdGet(Map arg0=null)
    abstract AvMatchItemToRendererMdReport avMatchItemToRendererMdReport(Map arg0=null)
}
