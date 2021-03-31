package me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait ManufacturerSpecificReport implements Command
{
    Integer manufacturerId
    String manufacturerName
    Integer productId
    Integer productTypeId
}