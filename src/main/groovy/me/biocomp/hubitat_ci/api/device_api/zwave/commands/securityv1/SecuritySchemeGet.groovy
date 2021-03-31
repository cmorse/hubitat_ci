package me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SecuritySchemeGet implements Command
{
    Short supportedSecuritySchemes
}