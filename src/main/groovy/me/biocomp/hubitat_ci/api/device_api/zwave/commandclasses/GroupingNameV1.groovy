package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.groupingnamev1.GroupingNameGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.groupingnamev1.GroupingNameReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.groupingnamev1.GroupingNameSet

trait GroupingNameV1
{
    abstract GroupingNameGet groupingNameGet(Map arg0=null)
    abstract GroupingNameReport groupingNameReport(Map arg0=null)
    abstract GroupingNameSet groupingNameSet(Map arg0=null)
}
