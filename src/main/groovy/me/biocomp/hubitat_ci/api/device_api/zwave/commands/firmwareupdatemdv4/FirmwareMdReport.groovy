package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareMdReport implements Command
{
    Integer checksum
    Integer firmwareId
    List firmwareIds
    Boolean firmwareUpgradable
    Integer manufacturerId
    Integer maxFragmentSize
    Short numberOfTargets
}