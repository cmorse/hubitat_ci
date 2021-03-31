package me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait DeviceSpecificReport implements Command
{
    List deviceIdData
    Short deviceIdDataFormat
    Short deviceIdDataLengthIndicator
    Short deviceIdType
    static Short DEVICE_ID_DATA_FORMAT_BINARY = 1
    static Short DEVICE_ID_DATA_FORMAT_UTF8 = 0
    static Short DEVICE_ID_TYPE_FACTORY_DEFAULT = 0
    static Short DEVICE_ID_TYPE_PSEUDO_RANDOM = 2
    static Short DEVICE_ID_TYPE_SERIAL_NUMBER = 1
}