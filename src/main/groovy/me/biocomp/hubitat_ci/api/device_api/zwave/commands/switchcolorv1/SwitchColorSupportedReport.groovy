package me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SwitchColorSupportedReport implements Command
{
    boolean amber
    boolean blue
    boolean coldWhite
    boolean cyan
    boolean green
    boolean index
    boolean purple
    boolean red
    boolean warmWhite
    boolean isAmber() { return amber }
    boolean isBlue() { return blue }
    boolean isColdWhite() { return coldWhite }
    boolean isCyan() { return cyan }
    boolean isGreen() { return green }
    boolean isIndex() { return index }
    boolean isPurple() { return purple }
    boolean isRed() { return red }
    boolean isWarmWhite() { return warmWhite }
}