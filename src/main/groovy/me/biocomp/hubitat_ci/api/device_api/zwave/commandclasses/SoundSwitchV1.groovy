package me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses

import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ConfigurationGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ConfigurationReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ConfigurationSet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ToneInfoGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ToneInfoReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonePlayGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonePlayReport
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonePlaySet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonesNumberGet
import me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonesNumberReport

trait SoundSwitchV1
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
