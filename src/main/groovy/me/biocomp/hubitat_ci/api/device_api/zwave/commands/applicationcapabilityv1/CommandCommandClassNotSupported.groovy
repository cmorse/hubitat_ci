package me.biocomp.hubitat_ci.api.device_api.zwave.commands.applicationcapabilityv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait CommandCommandClassNotSupported implements Command
{
    Boolean dynamic
    Short offendingCommand
    Short offendingCommandClass
}