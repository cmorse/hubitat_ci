package me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait PowerlevelTestNodeReport implements Command
{
    Short statusOfOperation
    Integer testFrameCount
    Short testNodeid
    static Short STATUS_OF_OPERATION_ZW_TEST_FAILED = 0
    static Short STATUS_OF_OPERATION_ZW_TEST_INPROGRESS = 2
    static Short STATUS_OF_OPERATION_ZW_TEST_SUCCES = 1
}