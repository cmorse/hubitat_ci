package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorconfigurationv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorTriggerLevelSet implements Command
{
    Boolean current
    Boolean defaultValue
    Short precision
    Short scale
    BigDecimal scaledTriggerValue
    Short sensorType
    Short size
    List triggerValue
}