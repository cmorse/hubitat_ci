package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv6

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
    Boolean frequency
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
    Boolean targetTemperature
    Boolean tideLevel
    Boolean time
    Boolean ultraviolet
    Boolean velocity
    Boolean voltage
    Boolean waterTemperature
    Boolean weight
}