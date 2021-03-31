package me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait TimeOffsetSet implements Command
{
    Short dayEndDst
    Short dayStartDst
    Short hourEndDst
    Short hourStartDst
    Short hourTzo
    Short minuteOffsetDst
    Short minuteTzo
    Short monthEndDst
    Short monthStartDst
    Short signOffsetDst
    Short signTzo
}