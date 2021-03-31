package me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandRecordsSupportedReport implements Command
{
    Boolean confCmd
    Integer freeCommandRecords
    Short maxCommandLength
    Integer maxCommandRecords
    Boolean vc
}