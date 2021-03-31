package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ConfigurationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ToneInfoGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ToneInfoReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonePlayGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonePlayReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonePlaySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonesNumberGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonesNumberReport

trait SoundSwitchV2
{
    abstract ConfigurationGet configurationGet()
    abstract ConfigurationReport configurationReport(Map arg0=null)
    abstract ConfigurationSet configurationSet(Map arg0=null)
    abstract ToneInfoGet toneInfoGet(Map arg0=null)
    abstract ToneInfoReport toneInfoReport(Map arg0=null)
    abstract TonePlayGet tonePlayGet()
    abstract TonePlayReport tonePlayReport(Map arg0=null)
    abstract TonePlaySet tonePlaySet(Map arg0=null)
    abstract TonesNumberGet tonesNumberGet()
    abstract TonesNumberReport tonesNumberReport(Map arg0=null)
}
