package me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ScreenAttributesReport implements Command
{
    Short numberOfCharactersPerLine
    Short numberOfLines
    Short numericalPresentationOfACharacter
    Short sizeOfLineBuffer
}