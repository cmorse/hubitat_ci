package me.biocomp.hubitat_ci.api.device_api.zwave

import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AlarmV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AlarmV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AntitheftUnlockV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AntitheftV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AntitheftV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AntitheftV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ApplicationCapabilityV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ApplicationStatusV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AssociationCommandConfigurationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AssociationGrpInfoV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AssociationGrpInfoV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AssociationGrpInfoV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AssociationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AssociationV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AssociationV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AvContentDirectoryMdV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AvContentSearchMdV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AvRendererStatusV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.AvTaggingMdV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.BarrierOperatorV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.BasicTariffInfoV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.BasicV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.BasicV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.BasicWindowCoveringV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.BatteryV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.BatteryV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.BatteryV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.CentralSceneV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.CentralSceneV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.CentralSceneV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ChimneyFanV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ClimateControlScheduleV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ClockV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ConfigurationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ConfigurationV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ControllerReplicationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.Crc16EncapV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.DcpConfigV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.DcpMonitorV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.DeviceResetLocallyV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.DmxV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.DoorLockLoggingV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.DoorLockV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.EnergyProductionV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.EntryControlV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.FirmwareUpdateMdV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.FirmwareUpdateMdV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.FirmwareUpdateMdV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.FirmwareUpdateMdV4
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.FirmwareUpdateMdV5
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.FirmwareUpdateMdV6
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.GeographicLocationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.GroupingNameV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.HailV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.HrvControlV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.HrvStatusV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.HumidityControlModeV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.HumidityControlModeV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.HumidityControlOperatingStateV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.HumidityControlSetpointV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.HumidityControlSetpointV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.IndicatorV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.IndicatorV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.IndicatorV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.IpConfigurationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.IrrigationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.LanguageV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.LockV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ManufacturerSpecificV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ManufacturerSpecificV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterPulseV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterTblConfigV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterTblMonitorV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterTblMonitorV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterTblPushV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterV4
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MeterV5
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MtpWindowCoveringV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiChannelAssociationV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiChannelAssociationV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiChannelAssociationV4
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiChannelV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiChannelV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiChannelV4
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiCmdV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiInstanceAssociationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.MultiInstanceV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NetworkManagementInstallationMaintenanceV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NetworkManagementInstallationMaintenanceV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NodeNamingV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NotificationV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NotificationV4
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NotificationV5
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NotificationV6
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NotificationV7
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.NotificationV8
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.PowerlevelV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.PrepaymentEncapsulationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.PrepaymentV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ProprietaryV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ProtectionV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ProtectionV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.RateTblConfigV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.RateTblMonitorV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.RemoteAssociationActivateV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.RemoteAssociationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SceneActivationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SceneActuatorConfV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SceneControllerConfV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ScheduleEntryLockV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ScheduleEntryLockV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ScheduleEntryLockV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ScheduleV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ScreenAttributesV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ScreenAttributesV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ScreenMdV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ScreenMdV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.Security2V1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SecurityPanelModeV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SecurityPanelZoneSensorV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SecurityPanelZoneV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SecurityV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorAlarmV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorBinaryV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorBinaryV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorConfigurationV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV10
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV11
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV4
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV5
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV6
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV7
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV8
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SensorMultilevelV9
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SilenceAlarmV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SimpleAvControlV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SoundSwitchV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SoundSwitchV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SupervisionV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SupervisionV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchAllV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchBinaryV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchBinaryV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchColorV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchColorV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchColorV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchMultilevelV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchMultilevelV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchMultilevelV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchMultilevelV4
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchToggleBinaryV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.SwitchToggleMultilevelV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.TariffConfigV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.TariffTblMonitorV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatFanModeV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatFanModeV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatFanModeV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatFanModeV4
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatFanModeV5
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatFanStateV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatFanStateV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatHeatingV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatModeV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatModeV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatModeV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatOperatingStateV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatOperatingStateV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatSetbackV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatSetpointV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatSetpointV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.ThermostatSetpointV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.TimeParametersV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.TimeV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.TimeV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.TransportServiceV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.UserCodeV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.VersionV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.VersionV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.VersionV3
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.WakeUpV1
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.WakeUpV2
import me.biocomp.hubitat_ci.api.device_api.zwave.commandclasses.WakeUpV3

trait Zwave
{
    abstract AlarmV1 getAlarmV1()
    abstract AlarmV2 getAlarmV2()
    abstract AntitheftUnlockV1 getAntitheftUnlockV1()
    abstract AntitheftV1 getAntitheftV1()
    abstract AntitheftV2 getAntitheftV2()
    abstract AntitheftV3 getAntitheftV3()
    abstract ApplicationCapabilityV1 getApplicationCapabilityV1()
    abstract ApplicationStatusV1 getApplicationStatusV1()
    abstract AssociationCommandConfigurationV1 getAssociationCommandConfigurationV1()
    abstract AssociationGrpInfoV1 getAssociationGrpInfoV1()
    abstract AssociationGrpInfoV2 getAssociationGrpInfoV2()
    abstract AssociationGrpInfoV3 getAssociationGrpInfoV3()
    abstract AssociationV1 getAssociationV1()
    abstract AssociationV2 getAssociationV2()
    abstract AssociationV3 getAssociationV3()
    abstract AvContentDirectoryMdV1 getAvContentDirectoryMdV1()
    abstract AvContentSearchMdV1 getAvContentSearchMdV1()
    abstract AvRendererStatusV1 getAvRendererStatusV1()
    abstract AvTaggingMdV1 getAvTaggingMdV1()
    abstract BarrierOperatorV1 getBarrierOperatorV1()
    abstract BasicTariffInfoV1 getBasicTariffInfoV1()
    abstract BasicV1 getBasicV1()
    abstract BasicV2 getBasicV2()
    abstract BasicWindowCoveringV1 getBasicWindowCoveringV1()
    abstract BatteryV1 getBatteryV1()
    abstract BatteryV2 getBatteryV2()
    abstract BatteryV3 getBatteryV3()
    abstract CentralSceneV1 getCentralSceneV1()
    abstract CentralSceneV2 getCentralSceneV2()
    abstract CentralSceneV3 getCentralSceneV3()
    abstract ChimneyFanV1 getChimneyFanV1()
    abstract ClimateControlScheduleV1 getClimateControlScheduleV1()
    abstract ClockV1 getClockV1()
    abstract ConfigurationV1 getConfigurationV1()
    abstract ConfigurationV2 getConfigurationV2()
    abstract ControllerReplicationV1 getControllerReplicationV1()
    abstract Crc16EncapV1 getCrc16EncapV1()
    abstract DcpConfigV1 getDcpConfigV1()
    abstract DcpMonitorV1 getDcpMonitorV1()
    abstract DeviceResetLocallyV1 getDeviceResetLocallyV1()
    abstract DmxV1 getDmxV1()
    abstract DoorLockLoggingV1 getDoorLockLoggingV1()
    abstract DoorLockV1 getDoorLockV1()
    abstract EnergyProductionV1 getEnergyProductionV1()
    abstract EntryControlV1 getEntryControlV1()
    abstract FirmwareUpdateMdV1 getFirmwareUpdateMdV1()
    abstract FirmwareUpdateMdV2 getFirmwareUpdateMdV2()
    abstract FirmwareUpdateMdV3 getFirmwareUpdateMdV3()
    abstract FirmwareUpdateMdV4 getFirmwareUpdateMdV4()
    abstract FirmwareUpdateMdV5 getFirmwareUpdateMdV5()
    abstract FirmwareUpdateMdV6 getFirmwareUpdateMdV6()
    abstract GeographicLocationV1 getGeographicLocationV1()
    abstract GroupingNameV1 getGroupingNameV1()
    abstract HailV1 getHailV1()
    abstract HrvControlV1 getHrvControlV1()
    abstract HrvStatusV1 getHrvStatusV1()
    abstract HumidityControlModeV1 getHumidityControlModeV1()
    abstract HumidityControlModeV2 getHumidityControlModeV2()
    abstract HumidityControlOperatingStateV1 getHumidityControlOperatingStateV1()
    abstract HumidityControlSetpointV1 getHumidityControlSetpointV1()
    abstract HumidityControlSetpointV2 getHumidityControlSetpointV2()
    abstract IndicatorV1 getIndicatorV1()
    abstract IndicatorV2 getIndicatorV2()
    abstract IndicatorV3 getIndicatorV3()
    abstract IpConfigurationV1 getIpConfigurationV1()
    abstract IrrigationV1 getIrrigationV1()
    abstract LanguageV1 getLanguageV1()
    abstract LockV1 getLockV1()
    abstract ManufacturerSpecificV1 getManufacturerSpecificV1()
    abstract ManufacturerSpecificV2 getManufacturerSpecificV2()
    abstract MeterPulseV1 getMeterPulseV1()
    abstract MeterTblConfigV1 getMeterTblConfigV1()
    abstract MeterTblMonitorV1 getMeterTblMonitorV1()
    abstract MeterTblMonitorV2 getMeterTblMonitorV2()
    abstract MeterTblPushV1 getMeterTblPushV1()
    abstract MeterV1 getMeterV1()
    abstract MeterV2 getMeterV2()
    abstract MeterV3 getMeterV3()
    abstract MeterV4 getMeterV4()
    abstract MeterV5 getMeterV5()
    abstract MtpWindowCoveringV1 getMtpWindowCoveringV1()
    abstract MultiChannelAssociationV2 getMultiChannelAssociationV2()
    abstract MultiChannelAssociationV3 getMultiChannelAssociationV3()
    abstract MultiChannelAssociationV4 getMultiChannelAssociationV4()
    abstract MultiChannelV2 getMultiChannelV2()
    abstract MultiChannelV3 getMultiChannelV3()
    abstract MultiChannelV4 getMultiChannelV4()
    abstract MultiCmdV1 getMultiCmdV1()
    abstract MultiInstanceAssociationV1 getMultiInstanceAssociationV1()
    abstract MultiInstanceV1 getMultiInstanceV1()
    abstract NetworkManagementInstallationMaintenanceV1 getNetworkManagementInstallationMaintenanceV1()
    abstract NetworkManagementInstallationMaintenanceV2 getNetworkManagementInstallationMaintenanceV2()
    abstract NodeNamingV1 getNodeNamingV1()
    abstract NotificationV3 getNotificationV3()
    abstract NotificationV4 getNotificationV4()
    abstract NotificationV5 getNotificationV5()
    abstract NotificationV6 getNotificationV6()
    abstract NotificationV7 getNotificationV7()
    abstract NotificationV8 getNotificationV8()
    abstract PowerlevelV1 getPowerlevelV1()
    abstract PrepaymentEncapsulationV1 getPrepaymentEncapsulationV1()
    abstract PrepaymentV1 getPrepaymentV1()
    abstract ProprietaryV1 getProprietaryV1()
    abstract ProtectionV1 getProtectionV1()
    abstract ProtectionV2 getProtectionV2()
    abstract RateTblConfigV1 getRateTblConfigV1()
    abstract RateTblMonitorV1 getRateTblMonitorV1()
    abstract RemoteAssociationActivateV1 getRemoteAssociationActivateV1()
    abstract RemoteAssociationV1 getRemoteAssociationV1()
    abstract SceneActivationV1 getSceneActivationV1()
    abstract SceneActuatorConfV1 getSceneActuatorConfV1()
    abstract SceneControllerConfV1 getSceneControllerConfV1()
    abstract ScheduleEntryLockV1 getScheduleEntryLockV1()
    abstract ScheduleEntryLockV2 getScheduleEntryLockV2()
    abstract ScheduleEntryLockV3 getScheduleEntryLockV3()
    abstract ScheduleV1 getScheduleV1()
    abstract ScreenAttributesV1 getScreenAttributesV1()
    abstract ScreenAttributesV2 getScreenAttributesV2()
    abstract ScreenMdV1 getScreenMdV1()
    abstract ScreenMdV2 getScreenMdV2()
    abstract Security2V1 getSecurity2V1()
    abstract SecurityPanelModeV1 getSecurityPanelModeV1()
    abstract SecurityPanelZoneSensorV1 getSecurityPanelZoneSensorV1()
    abstract SecurityPanelZoneV1 getSecurityPanelZoneV1()
    abstract SecurityV1 getSecurityV1()
    abstract SensorAlarmV1 getSensorAlarmV1()
    abstract SensorBinaryV1 getSensorBinaryV1()
    abstract SensorBinaryV2 getSensorBinaryV2()
    abstract SensorConfigurationV1 getSensorConfigurationV1()
    abstract SensorMultilevelV1 getSensorMultilevelV1()
    abstract SensorMultilevelV10 getSensorMultilevelV10()
    abstract SensorMultilevelV11 getSensorMultilevelV11()
    abstract SensorMultilevelV2 getSensorMultilevelV2()
    abstract SensorMultilevelV3 getSensorMultilevelV3()
    abstract SensorMultilevelV4 getSensorMultilevelV4()
    abstract SensorMultilevelV5 getSensorMultilevelV5()
    abstract SensorMultilevelV6 getSensorMultilevelV6()
    abstract SensorMultilevelV7 getSensorMultilevelV7()
    abstract SensorMultilevelV8 getSensorMultilevelV8()
    abstract SensorMultilevelV9 getSensorMultilevelV9()
    abstract SilenceAlarmV1 getSilenceAlarmV1()
    abstract SimpleAvControlV1 getSimpleAvControlV1()
    abstract SoundSwitchV1 getSoundSwitchV1()
    abstract SoundSwitchV2 getSoundSwitchV2()
    abstract SupervisionV1 getSupervisionV1()
    abstract SupervisionV2 getSupervisionV2()
    abstract SwitchAllV1 getSwitchAllV1()
    abstract SwitchBinaryV1 getSwitchBinaryV1()
    abstract SwitchBinaryV2 getSwitchBinaryV2()
    abstract SwitchColorV1 getSwitchColorV1()
    abstract SwitchColorV2 getSwitchColorV2()
    abstract SwitchColorV3 getSwitchColorV3()
    abstract SwitchMultilevelV1 getSwitchMultilevelV1()
    abstract SwitchMultilevelV2 getSwitchMultilevelV2()
    abstract SwitchMultilevelV3 getSwitchMultilevelV3()
    abstract SwitchMultilevelV4 getSwitchMultilevelV4()
    abstract SwitchToggleBinaryV1 getSwitchToggleBinaryV1()
    abstract SwitchToggleMultilevelV1 getSwitchToggleMultilevelV1()
    abstract TariffConfigV1 getTariffConfigV1()
    abstract TariffTblMonitorV1 getTariffTblMonitorV1()
    abstract ThermostatFanModeV1 getThermostatFanModeV1()
    abstract ThermostatFanModeV2 getThermostatFanModeV2()
    abstract ThermostatFanModeV3 getThermostatFanModeV3()
    abstract ThermostatFanModeV4 getThermostatFanModeV4()
    abstract ThermostatFanModeV5 getThermostatFanModeV5()
    abstract ThermostatFanStateV1 getThermostatFanStateV1()
    abstract ThermostatFanStateV2 getThermostatFanStateV2()
    abstract ThermostatHeatingV1 getThermostatHeatingV1()
    abstract ThermostatModeV1 getThermostatModeV1()
    abstract ThermostatModeV2 getThermostatModeV2()
    abstract ThermostatModeV3 getThermostatModeV3()
    abstract ThermostatOperatingStateV1 getThermostatOperatingStateV1()
    abstract ThermostatOperatingStateV2 getThermostatOperatingStateV2()
    abstract ThermostatSetbackV1 getThermostatSetbackV1()
    abstract ThermostatSetpointV1 getThermostatSetpointV1()
    abstract ThermostatSetpointV2 getThermostatSetpointV2()
    abstract ThermostatSetpointV3 getThermostatSetpointV3()
    abstract TimeParametersV1 getTimeParametersV1()
    abstract TimeV1 getTimeV1()
    abstract TimeV2 getTimeV2()
    abstract TransportServiceV1 getTransportServiceV1()
    abstract UserCodeV1 getUserCodeV1()
    abstract VersionV1 getVersionV1()
    abstract VersionV2 getVersionV2()
    abstract VersionV3 getVersionV3()
    abstract WakeUpV1 getWakeUpV1()
    abstract WakeUpV2 getWakeUpV2()
    abstract WakeUpV3 getWakeUpV3()

    abstract Command getCommand(byte arg0, byte arg1, byte[] arg2, Integer arg3=null)
    abstract Command getCommand(Short arg0, Short arg1, List arg2, Integer arg3=null)
    abstract Command parse(String command, boolean arg0=false)
    abstract Command parse(String command, Map commandClassVersions, boolean arg0=false)
}
