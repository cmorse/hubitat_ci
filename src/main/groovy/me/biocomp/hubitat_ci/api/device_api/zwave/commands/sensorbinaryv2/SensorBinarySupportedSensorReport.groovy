package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorBinarySupportedSensorReport implements Command
{
    Boolean aux
    Boolean co
    Boolean co2
    Boolean doorwindow
    Boolean first
    Boolean freeze
    Boolean general
    Boolean glassBreak
    Boolean heat
    Boolean motion
    Boolean smoke
    Boolean tamper
    Boolean tilt
    Boolean water
}