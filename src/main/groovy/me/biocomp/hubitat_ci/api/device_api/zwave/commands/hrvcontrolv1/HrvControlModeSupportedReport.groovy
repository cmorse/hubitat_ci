package me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait HrvControlModeSupportedReport implements Command
{
    Boolean demandAutomatic
    Boolean energySavingsMode
    Boolean manual
    Short manualControlSupported
    Boolean off
    Boolean schedule
    static Short MANUAL_CONTROL_SUPPORTED_BYPASS_AUTO = 1
    static Short MANUAL_CONTROL_SUPPORTED_BYPASS_OPEN_CLOSE = 0
    static Short MANUAL_CONTROL_SUPPORTED_MODULATED_BYPASS = 2
    static Short MANUAL_CONTROL_SUPPORTED_VENTILATION_RATE = 3
}