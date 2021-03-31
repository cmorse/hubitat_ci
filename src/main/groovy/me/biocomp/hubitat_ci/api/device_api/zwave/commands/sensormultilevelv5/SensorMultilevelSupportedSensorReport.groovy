package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorMultilevelSupportedSensorReport implements Command
{
    Boolean airFlow
    Boolean airTemperature
    Boolean anglePosition
    Boolean atmosphericPressure
    Boolean barometricPressure
    Boolean carbonDioxideLevel
    Boolean current
    Boolean dewPoint
    Boolean direction
    Boolean distance
    Boolean electricalConductivity
    Boolean electricalResistivity
    Boolean generalPurposeValue
    Boolean humidity
    Boolean loudness
    Boolean luminance
    Boolean moisture
    Boolean power
    Boolean rainRate
    Boolean rotation
    Boolean seismicIntensity
    Boolean seismicMagnitude
    Boolean soilTemperature
    Boolean solarRadiation
    Boolean tankCapacity
    Boolean tideLevel
    Boolean ultraviolet
    Boolean velocity
    Boolean voltage
    Boolean waterTemperature
    Boolean weight
}