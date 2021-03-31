package me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait FirmwareMdReport implements Command
{
    Boolean cc
    Integer checksum
    Integer firmwareId
    List firmwareIds
    Boolean firmwareUpgradable
    Short hardwareVersion
    Integer manufacturerId
    Integer maxFragmentSize
    Short numberOfTargets
}