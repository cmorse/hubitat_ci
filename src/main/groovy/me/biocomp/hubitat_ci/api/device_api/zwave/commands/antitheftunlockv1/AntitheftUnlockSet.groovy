package me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftunlockv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait AntitheftUnlockSet implements Command
{
    List magicCode
    Short magicCodeLength
}