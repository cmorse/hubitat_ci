package me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait KexFail implements Command
{
    Short failType
    static Short KEX_FAIL_AUTH = 7
    static Short KEX_FAIL_CANCEL = 6
    static Short KEX_FAIL_DECRYPT = 5
    static Short KEX_FAIL_KEX_CURVES = 3
    static Short KEX_FAIL_KEX_KEY = 1
    static Short KEX_FAIL_KEX_SCHEME = 2
    static Short KEX_FAIL_KEY_GET = 8
    static Short KEX_FAIL_KEY_REPORT = 10
    static Short KEX_FAIL_KEY_VERIFY = 9
}