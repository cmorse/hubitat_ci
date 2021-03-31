package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorMultilevelSupportedSensorReport implements Command
{
    Boolean airFlow
    Boolean airTemperature
    Boolean anglePosition
    Boolean atmosphericPressure
    Boolean barometricPressure
    Boolean bloodPressure
    Boolean bodyMass
    Boolean bodyMassIndex
    Boolean boneMass
    Boolean carbonDioxideLevel
    Boolean carbonMonoxideLevel
    Boolean current
    Boolean dewPoint
    Boolean direction
    Boolean distance
    Boolean electricalConductivity
    Boolean electricalResistivity
    Boolean fatMass
    Boolean formaldehydeLevel
    Boolean frequency
    Boolean generalPurposeValue
    Boolean heartRate
    Boolean humidity
    Boolean loudness
    Boolean luminance
    Boolean metabolicBasis
    Boolean methaneLevel
    Boolean moisture
    Boolean muscleMass
    Boolean particulateMaterLevel
    Boolean power
    Boolean radonConcentration
    Boolean rainRate
    Boolean rotation
    Boolean seismicIntensity
    Boolean seismicMagnitude
    Boolean soilHumidity
    Boolean soilReactivity
    Boolean soilSalinity
    Boolean soilTemperature
    Boolean solarRadiation
    Boolean tankCapacity
    Boolean targetTemperature
    Boolean tideLevel
    Boolean time
    Boolean ultraviolet
    Boolean velocity
    Boolean vocLevel
    Boolean voltage
    Boolean waterTemperature
    Boolean weight
}