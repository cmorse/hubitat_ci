/**
 * @note The interfaces in this file should only be used to build actual capabilities and should never be used directly
 */

package me.biocomp.hubitat_ci.capabilities

import groovy.transform.CompileStatic

interface MuteUnmuteFunctionsOnlyInternal extends Capability
{
    @CompileStatic
    abstract void mute()

    @CompileStatic
    abstract void unmute()
}

interface MuteUnmuteInternal extends MuteUnmuteFunctionsOnlyInternal
{
    static Map<String, CapabilityAttributeInfo> _internalAttributes = CapabilityAttributeInfo.makeList{
        enumAttribute("mute", ["unmuted", "muted"])
    }
}

interface SwitchInternal extends Capability
{
    static Map<String, CapabilityAttributeInfo> _internalAttributes = CapabilityAttributeInfo.makeList{
        enumAttribute("switch", ["on", "off"])
    }

    @CompileStatic
    abstract void on()

    @CompileStatic
    abstract void off()
}

interface VolumeUpDownFunctionsOnlyInternal extends Capability
{
    @CompileStatic
    abstract void volumeDown()

    @CompileStatic
    abstract void volumeUp()
}

interface VolumeInternal extends VolumeUpDownFunctionsOnlyInternal
{
    static Map<String, CapabilityAttributeInfo> _internalAttributes = CapabilityAttributeInfo.makeList {
        number("volume", min: 0, max: 100) // Double
    }
}