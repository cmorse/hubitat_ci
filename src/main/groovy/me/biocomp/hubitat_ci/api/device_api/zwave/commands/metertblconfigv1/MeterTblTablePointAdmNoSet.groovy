package me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblconfigv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait MeterTblTablePointAdmNoSet implements Command
{
    List meterPointAdmNumberCharacter
    Short numberOfCharacters
}