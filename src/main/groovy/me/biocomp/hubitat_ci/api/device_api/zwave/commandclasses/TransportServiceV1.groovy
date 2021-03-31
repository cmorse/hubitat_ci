package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandFirstFragment
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandFragmentComplete
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandFragmentRequest
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandFragmentWait
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandSubsequentFragment

trait TransportServiceV1
{
    abstract CommandFirstFragment commandFirstFragment(Map arg0=null)
    abstract CommandFragmentComplete commandFragmentComplete(Map arg0=null)
    abstract CommandFragmentRequest commandFragmentRequest(Map arg0=null)
    abstract CommandFragmentWait commandFragmentWait(Map arg0=null)
    abstract CommandSubsequentFragment commandSubsequentFragment(Map arg0=null)
}
