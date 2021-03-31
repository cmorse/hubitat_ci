package me.biocomp.hubitat_ci.api.device_api.zwave.commands.geographiclocationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait GeographicLocationReport implements Command
{
    Boolean latSign
    Short latitudeDegrees
    Short latitudeMinutes
    Boolean longSign
    Short longitudeDegrees
    Short longitudeMinutes
}