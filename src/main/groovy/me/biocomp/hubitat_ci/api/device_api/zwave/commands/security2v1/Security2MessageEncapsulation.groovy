package me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait Security2MessageEncapsulation implements Command
{
    Boolean encryptedExtension
    List encryptedExtensions
    Boolean extension
    List extensions
    Short sequenceNumber
}