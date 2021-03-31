package me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScreenAttributesReport implements Command
{
    Boolean escapeSequence
    Short numberOfCharactersPerLine
    Short numberOfLines
    Short numericalPresentationOfACharacter
    Short screenTimeout
    Short sizeOfLineBuffer
}