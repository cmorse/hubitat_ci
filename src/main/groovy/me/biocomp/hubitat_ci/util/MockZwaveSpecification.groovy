package me.biocomp.hubitat_ci.util

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

import me.biocomp.hubitat_ci.api.device_api.zwave.Command
import me.biocomp.hubitat_ci.api.device_api.zwave.Zwave

import spock.lang.Specification

class MockZwaveSpecification extends Specification
{
    AlarmV1 createAlarmV1Mock()
    {
        def mock = Mock(AlarmV1)
        {
            _ * alarmGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv1.AlarmGet)
            _ * alarmReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv1.AlarmReport)
        }
        return mock
    }

    AlarmV2 createAlarmV2Mock()
    {
        def mock = Mock(AlarmV2)
        {
            _ * alarmGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmGet)
            _ * alarmReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmReport)
            _ * alarmSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmSet)
            _ * alarmTypeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmTypeSupportedGet)
            _ * alarmTypeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.alarmv2.AlarmTypeSupportedReport)
        }
        return mock
    }

    AntitheftUnlockV1 createAntitheftUnlockV1Mock()
    {
        def mock = Mock(AntitheftUnlockV1)
        {
            _ * antitheftUnlockSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftunlockv1.AntitheftUnlockSet)
            _ * antitheftUnlockStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftunlockv1.AntitheftUnlockStateGet)
            _ * antitheftUnlockStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftunlockv1.AntitheftUnlockStateReport)
        }
        return mock
    }

    AntitheftV1 createAntitheftV1Mock()
    {
        def mock = Mock(AntitheftV1)
        {
            _ * antitheftGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv1.AntitheftGet)
            _ * antitheftReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv1.AntitheftReport)
            _ * antitheftSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv1.AntitheftSet)
        }
        return mock
    }

    AntitheftV2 createAntitheftV2Mock()
    {
        def mock = Mock(AntitheftV2)
        {
            _ * antitheftGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv2.AntitheftGet)
            _ * antitheftReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv2.AntitheftReport)
            _ * antitheftSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv2.AntitheftSet)
        }
        return mock
    }

    AntitheftV3 createAntitheftV3Mock()
    {
        def mock = Mock(AntitheftV3)
        {
            _ * antitheftGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv3.AntitheftGet)
            _ * antitheftReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv3.AntitheftReport)
            _ * antitheftSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.antitheftv3.AntitheftSet)
        }
        return mock
    }

    ApplicationCapabilityV1 createApplicationCapabilityV1Mock()
    {
        def mock = Mock(ApplicationCapabilityV1)
        {
            _ * commandCommandClassNotSupported(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.applicationcapabilityv1.CommandCommandClassNotSupported)
        }
        return mock
    }

    ApplicationStatusV1 createApplicationStatusV1Mock()
    {
        def mock = Mock(ApplicationStatusV1)
        {
            _ * applicationBusy(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.applicationstatusv1.ApplicationBusy)
            _ * applicationRejectedRequest(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.applicationstatusv1.ApplicationRejectedRequest)
        }
        return mock
    }

    AssociationCommandConfigurationV1 createAssociationCommandConfigurationV1Mock()
    {
        def mock = Mock(AssociationCommandConfigurationV1)
        {
            _ * commandConfigurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandConfigurationGet)
            _ * commandConfigurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandConfigurationReport)
            _ * commandConfigurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandConfigurationSet)
            _ * commandRecordsSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandRecordsSupportedGet)
            _ * commandRecordsSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationcommandconfigurationv1.CommandRecordsSupportedReport)
        }
        return mock
    }

    AssociationGrpInfoV1 createAssociationGrpInfoV1Mock()
    {
        def mock = Mock(AssociationGrpInfoV1)
        {
            _ * associationGroupCommandListGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupCommandListGet)
            _ * associationGroupCommandListReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupCommandListReport)
            _ * associationGroupInfoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupInfoGet)
            _ * associationGroupInfoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupInfoReport)
            _ * associationGroupNameGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupNameGet)
            _ * associationGroupNameReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov1.AssociationGroupNameReport)
        }
        return mock
    }

    AssociationGrpInfoV2 createAssociationGrpInfoV2Mock()
    {
        def mock = Mock(AssociationGrpInfoV2)
        {
            _ * associationGroupCommandListGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupCommandListGet)
            _ * associationGroupCommandListReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupCommandListReport)
            _ * associationGroupInfoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupInfoGet)
            _ * associationGroupInfoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupInfoReport)
            _ * associationGroupNameGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupNameGet)
            _ * associationGroupNameReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov2.AssociationGroupNameReport)
        }
        return mock
    }

    AssociationGrpInfoV3 createAssociationGrpInfoV3Mock()
    {
        def mock = Mock(AssociationGrpInfoV3)
        {
            _ * associationGroupCommandListGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3.AssociationGroupCommandListGet)
            _ * associationGroupCommandListReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3.AssociationGroupCommandListReport)
            _ * associationGroupInfoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3.AssociationGroupInfoGet)
            _ * associationGroupInfoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3.AssociationGroupInfoReport)
            _ * associationGroupNameGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3.AssociationGroupNameGet)
            _ * associationGroupNameReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationgrpinfov3.AssociationGroupNameReport)
        }
        return mock
    }

    AssociationV1 createAssociationV1Mock()
    {
        def mock = Mock(AssociationV1)
        {
            _ * associationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationGet)
            _ * associationGroupingsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationGroupingsGet)
            _ * associationGroupingsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationGroupingsReport)
            _ * associationRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationRemove)
            _ * associationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationReport)
            _ * associationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv1.AssociationSet)
        }
        return mock
    }

    AssociationV2 createAssociationV2Mock()
    {
        def mock = Mock(AssociationV2)
        {
            _ * associationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationGet)
            _ * associationGroupingsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationGroupingsGet)
            _ * associationGroupingsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationGroupingsReport)
            _ * associationRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationRemove)
            _ * associationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationReport)
            _ * associationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationSet)
            _ * associationSpecificGroupGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationSpecificGroupGet)
            _ * associationSpecificGroupReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv2.AssociationSpecificGroupReport)
        }
        return mock
    }

    AssociationV3 createAssociationV3Mock()
    {
        def mock = Mock(AssociationV3)
        {
            _ * associationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationGet)
            _ * associationGroupingsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationGroupingsGet)
            _ * associationGroupingsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationGroupingsReport)
            _ * associationRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationRemove)
            _ * associationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationReport)
            _ * associationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationSet)
            _ * associationSpecificGroupGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationSpecificGroupGet)
            _ * associationSpecificGroupReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.associationv3.AssociationSpecificGroupReport)
        }
        return mock
    }

    AvContentDirectoryMdV1 createAvContentDirectoryMdV1Mock()
    {
        def mock = Mock(AvContentDirectoryMdV1)
        {
            _ * avContentBrowseMdByLetterGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdByLetterGet)
            _ * avContentBrowseMdByLetterReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdByLetterReport)
            _ * avContentBrowseMdChildCountGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdChildCountGet)
            _ * avContentBrowseMdChildCountReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdChildCountReport)
            _ * avContentBrowseMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdGet)
            _ * avContentBrowseMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvContentBrowseMdReport)
            _ * avMatchItemToRendererMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvMatchItemToRendererMdGet)
            _ * avMatchItemToRendererMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentdirectorymdv1.AvMatchItemToRendererMdReport)
        }
        return mock
    }

    AvContentSearchMdV1 createAvContentSearchMdV1Mock()
    {
        def mock = Mock(AvContentSearchMdV1)
        {
            _ * avContentSearchMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentsearchmdv1.AvContentSearchMdGet)
            _ * avContentSearchMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avcontentsearchmdv1.AvContentSearchMdReport)
        }
        return mock
    }

    AvRendererStatusV1 createAvRendererStatusV1Mock()
    {
        def mock = Mock(AvRendererStatusV1)
        {
            _ * avRendererStatusGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avrendererstatusv1.AvRendererStatusGet)
            _ * avRendererStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avrendererstatusv1.AvRendererStatusReport)
        }
        return mock
    }

    AvTaggingMdV1 createAvTaggingMdV1Mock()
    {
        def mock = Mock(AvTaggingMdV1)
        {
            _ * avTaggingMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avtaggingmdv1.AvTaggingMdGet)
            _ * avTaggingMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.avtaggingmdv1.AvTaggingMdReport)
        }
        return mock
    }

    BarrierOperatorV1 createBarrierOperatorV1Mock()
    {
        def mock = Mock(BarrierOperatorV1)
        {
            _ * barrierOperatorGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.barrieroperatorv1.BarrierOperatorGet)
            _ * barrierOperatorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.barrieroperatorv1.BarrierOperatorReport)
            _ * barrierOperatorSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.barrieroperatorv1.BarrierOperatorSet)
        }
        return mock
    }

    BasicTariffInfoV1 createBasicTariffInfoV1Mock()
    {
        def mock = Mock(BasicTariffInfoV1)
        {
            _ * basicTariffInfoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basictariffinfov1.BasicTariffInfoGet)
            _ * basicTariffInfoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basictariffinfov1.BasicTariffInfoReport)
        }
        return mock
    }

    BasicV1 createBasicV1Mock()
    {
        def mock = Mock(BasicV1)
        {
            _ * basicGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv1.BasicGet)
            _ * basicReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv1.BasicReport)
            _ * basicSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv1.BasicSet)
        }
        return mock
    }

    BasicV2 createBasicV2Mock()
    {
        def mock = Mock(BasicV2)
        {
            _ * basicGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv2.BasicGet)
            _ * basicReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv2.BasicReport)
            _ * basicSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicv2.BasicSet)
        }
        return mock
    }

    BasicWindowCoveringV1 createBasicWindowCoveringV1Mock()
    {
        def mock = Mock(BasicWindowCoveringV1)
        {
            _ * basicWindowCoveringStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicwindowcoveringv1.BasicWindowCoveringStartLevelChange)
            _ * basicWindowCoveringStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.basicwindowcoveringv1.BasicWindowCoveringStopLevelChange)
        }
        return mock
    }

    BatteryV1 createBatteryV1Mock()
    {
        def mock = Mock(BatteryV1)
        {
            _ * batteryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv1.BatteryGet)
            _ * batteryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv1.BatteryReport)
        }
        return mock
    }

    BatteryV2 createBatteryV2Mock()
    {
        def mock = Mock(BatteryV2)
        {
            _ * batteryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2.BatteryGet)
            _ * batteryHealthGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2.BatteryHealthGet)
            _ * batteryHealthReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2.BatteryHealthReport)
            _ * batteryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv2.BatteryReport)
        }
        return mock
    }

    BatteryV3 createBatteryV3Mock()
    {
        def mock = Mock(BatteryV3)
        {
            _ * batteryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3.BatteryGet)
            _ * batteryHealthGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3.BatteryHealthGet)
            _ * batteryHealthReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3.BatteryHealthReport)
            _ * batteryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.batteryv3.BatteryReport)
        }
        return mock
    }

    CentralSceneV1 createCentralSceneV1Mock()
    {
        def mock = Mock(CentralSceneV1)
        {
            _ * centralSceneNotification(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev1.CentralSceneNotification)
            _ * centralSceneSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev1.CentralSceneSupportedGet)
            _ * centralSceneSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev1.CentralSceneSupportedReport)
        }
        return mock
    }

    CentralSceneV2 createCentralSceneV2Mock()
    {
        def mock = Mock(CentralSceneV2)
        {
            _ * centralSceneNotification(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev2.CentralSceneNotification)
            _ * centralSceneSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev2.CentralSceneSupportedGet)
            _ * centralSceneSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev2.CentralSceneSupportedReport)
        }
        return mock
    }

    CentralSceneV3 createCentralSceneV3Mock()
    {
        def mock = Mock(CentralSceneV3)
        {
            _ * centralSceneConfigurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneConfigurationGet)
            _ * centralSceneConfigurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneConfigurationReport)
            _ * centralSceneConfigurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneConfigurationSet)
            _ * centralSceneNotification(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneNotification)
            _ * centralSceneSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneSupportedGet)
            _ * centralSceneSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.centralscenev3.CentralSceneSupportedReport)
        }
        return mock
    }

    ChimneyFanV1 createChimneyFanV1Mock()
    {
        def mock = Mock(ChimneyFanV1)
        {
            _ * chimneyFanAlarmLogGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmLogGet)
            _ * chimneyFanAlarmLogReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmLogReport)
            _ * chimneyFanAlarmLogSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmLogSet)
            _ * chimneyFanAlarmStatusGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmStatusGet)
            _ * chimneyFanAlarmStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmStatusReport)
            _ * chimneyFanAlarmStatusSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmStatusSet)
            _ * chimneyFanAlarmTempGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmTempGet)
            _ * chimneyFanAlarmTempReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmTempReport)
            _ * chimneyFanAlarmTempSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanAlarmTempSet)
            _ * chimneyFanBoostTimeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanBoostTimeGet)
            _ * chimneyFanBoostTimeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanBoostTimeReport)
            _ * chimneyFanBoostTimeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanBoostTimeSet)
            _ * chimneyFanDefaultSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanDefaultSet)
            _ * chimneyFanMinSpeedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanMinSpeedGet)
            _ * chimneyFanMinSpeedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanMinSpeedReport)
            _ * chimneyFanMinSpeedSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanMinSpeedSet)
            _ * chimneyFanModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanModeGet)
            _ * chimneyFanModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanModeReport)
            _ * chimneyFanModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanModeSet)
            _ * chimneyFanSetupGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSetupGet)
            _ * chimneyFanSetupReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSetupReport)
            _ * chimneyFanSetupSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSetupSet)
            _ * chimneyFanSpeedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSpeedGet)
            _ * chimneyFanSpeedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSpeedReport)
            _ * chimneyFanSpeedSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanSpeedSet)
            _ * chimneyFanStartTempGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStartTempGet)
            _ * chimneyFanStartTempReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStartTempReport)
            _ * chimneyFanStartTempSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStartTempSet)
            _ * chimneyFanStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStateGet)
            _ * chimneyFanStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStateReport)
            _ * chimneyFanStateSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStateSet)
            _ * chimneyFanStatusGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStatusGet)
            _ * chimneyFanStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStatusReport)
            _ * chimneyFanStopTempGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTempGet)
            _ * chimneyFanStopTempReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTempReport)
            _ * chimneyFanStopTempSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTempSet)
            _ * chimneyFanStopTimeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTimeGet)
            _ * chimneyFanStopTimeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTimeReport)
            _ * chimneyFanStopTimeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.chimneyfanv1.ChimneyFanStopTimeSet)
        }
        return mock
    }

    ClimateControlScheduleV1 createClimateControlScheduleV1Mock()
    {
        def mock = Mock(ClimateControlScheduleV1)
        {
            _ * scheduleChangedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleChangedGet)
            _ * scheduleChangedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleChangedReport)
            _ * scheduleGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleGet)
            _ * scheduleOverrideGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleOverrideGet)
            _ * scheduleOverrideReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleOverrideReport)
            _ * scheduleOverrideSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleOverrideSet)
            _ * scheduleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleReport)
            _ * scheduleSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.climatecontrolschedulev1.ScheduleSet)
        }
        return mock
    }

    ClockV1 createClockV1Mock()
    {
        def mock = Mock(ClockV1)
        {
            _ * clockGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.clockv1.ClockGet)
            _ * clockReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.clockv1.ClockReport)
            _ * clockSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.clockv1.ClockSet)
        }
        return mock
    }

    ConfigurationV1 createConfigurationV1Mock()
    {
        def mock = Mock(ConfigurationV1)
        {
            _ * configurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv1.ConfigurationGet)
            _ * configurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv1.ConfigurationReport)
            _ * configurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv1.ConfigurationSet)
        }
        return mock
    }

    ConfigurationV2 createConfigurationV2Mock()
    {
        def mock = Mock(ConfigurationV2)
        {
            _ * configurationBulkGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationBulkGet)
            _ * configurationBulkReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationBulkReport)
            _ * configurationBulkSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationBulkSet)
            _ * configurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationGet)
            _ * configurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationReport)
            _ * configurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.configurationv2.ConfigurationSet)
        }
        return mock
    }

    ControllerReplicationV1 createControllerReplicationV1Mock()
    {
        def mock = Mock(ControllerReplicationV1)
        {
            _ * ctrlReplicationTransferGroup(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1.CtrlReplicationTransferGroup)
            _ * ctrlReplicationTransferGroupName(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1.CtrlReplicationTransferGroupName)
            _ * ctrlReplicationTransferScene(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1.CtrlReplicationTransferScene)
            _ * ctrlReplicationTransferSceneName(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.controllerreplicationv1.CtrlReplicationTransferSceneName)
        }
        return mock
    }

    Crc16EncapV1 createCrc16EncapV1Mock()
    {
        def mock = Mock(Crc16EncapV1)
        {
            _ * crc16Encap(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.crc16encapv1.Crc16Encap)
        }
        return mock
    }

    DcpConfigV1 createDcpConfigV1Mock()
    {
        def mock = Mock(DcpConfigV1)
        {
            _ * dcpListRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1.DcpListRemove)
            _ * dcpListSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1.DcpListSet)
            _ * dcpListSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1.DcpListSupportedGet)
            _ * dcpListSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpconfigv1.DcpListSupportedReport)
        }
        return mock
    }

    DcpMonitorV1 createDcpMonitorV1Mock()
    {
        def mock = Mock(DcpMonitorV1)
        {
            _ * dcpEventStatusGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1.DcpEventStatusGet)
            _ * dcpEventStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1.DcpEventStatusReport)
            _ * dcpListGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1.DcpListGet)
            _ * dcpListReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dcpmonitorv1.DcpListReport)
        }
        return mock
    }

    DeviceResetLocallyV1 createDeviceResetLocallyV1Mock()
    {
        def mock = Mock(DeviceResetLocallyV1)
        {
            _ * deviceResetLocallyNotification(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.deviceresetlocallyv1.DeviceResetLocallyNotification)
        }
        return mock
    }

    DmxV1 createDmxV1Mock()
    {
        def mock = Mock(DmxV1)
        {
            _ * dmxAddressGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxAddressGet)
            _ * dmxAddressReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxAddressReport)
            _ * dmxAddressSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxAddressSet)
            _ * dmxCapabilityGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxCapabilityGet)
            _ * dmxCapabilityReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxCapabilityReport)
            _ * dmxData(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.dmxv1.DmxData)
        }
        return mock
    }

    DoorLockLoggingV1 createDoorLockLoggingV1Mock()
    {
        def mock = Mock(DoorLockLoggingV1)
        {
            _ * doorLockLoggingRecordsSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1.DoorLockLoggingRecordsSupportedGet)
            _ * doorLockLoggingRecordsSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1.DoorLockLoggingRecordsSupportedReport)
            _ * recordGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1.RecordGet)
            _ * recordReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockloggingv1.RecordReport)
        }
        return mock
    }

    DoorLockV1 createDoorLockV1Mock()
    {
        def mock = Mock(DoorLockV1)
        {
            _ * doorLockConfigurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockConfigurationGet)
            _ * doorLockConfigurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockConfigurationReport)
            _ * doorLockConfigurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockConfigurationSet)
            _ * doorLockOperationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockOperationGet)
            _ * doorLockOperationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockOperationReport)
            _ * doorLockOperationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.doorlockv1.DoorLockOperationSet)
        }
        return mock
    }

    EnergyProductionV1 createEnergyProductionV1Mock()
    {
        def mock = Mock(EnergyProductionV1)
        {
            _ * energyProductionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.energyproductionv1.EnergyProductionGet)
            _ * energyProductionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.energyproductionv1.EnergyProductionReport)
        }
        return mock
    }

    EntryControlV1 createEntryControlV1Mock()
    {
        def mock = Mock(EntryControlV1)
        {
            _ * entryControlConfigurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlConfigurationGet)
            _ * entryControlConfigurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlConfigurationReport)
            _ * entryControlConfigurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlConfigurationSet)
            _ * entryControlEventSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlEventSupportedGet)
            _ * entryControlEventSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlEventSupportedReport)
            _ * entryControlKeySupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlKeySupportedGet)
            _ * entryControlKeySupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlKeySupportedReport)
            _ * entryControlNotification(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.entrycontrolv1.EntryControlNotification)
        }
        return mock
    }

    FirmwareUpdateMdV1 createFirmwareUpdateMdV1Mock()
    {
        def mock = Mock(FirmwareUpdateMdV1)
        {
            _ * firmwareMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareMdGet)
            _ * firmwareMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareMdReport)
            _ * firmwareUpdateMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdGet)
            _ * firmwareUpdateMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdReport)
            _ * firmwareUpdateMdRequestGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdRequestGet)
            _ * firmwareUpdateMdRequestReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdRequestReport)
            _ * firmwareUpdateMdStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv1.FirmwareUpdateMdStatusReport)
        }
        return mock
    }

    FirmwareUpdateMdV2 createFirmwareUpdateMdV2Mock()
    {
        def mock = Mock(FirmwareUpdateMdV2)
        {
            _ * firmwareMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv2.FirmwareMdGet)
            _ * firmwareMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv2.FirmwareMdReport)
            _ * firmwareUpdateMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv2.FirmwareUpdateMdGet)
            _ * firmwareUpdateMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv2.FirmwareUpdateMdReport)
            _ * firmwareUpdateMdRequestGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv2.FirmwareUpdateMdRequestGet)
            _ * firmwareUpdateMdRequestReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv2.FirmwareUpdateMdRequestReport)
            _ * firmwareUpdateMdStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv2.FirmwareUpdateMdStatusReport)
        }
        return mock
    }

    FirmwareUpdateMdV3 createFirmwareUpdateMdV3Mock()
    {
        def mock = Mock(FirmwareUpdateMdV3)
        {
            _ * firmwareMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3.FirmwareMdGet)
            _ * firmwareMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3.FirmwareMdReport)
            _ * firmwareUpdateMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3.FirmwareUpdateMdGet)
            _ * firmwareUpdateMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3.FirmwareUpdateMdReport)
            _ * firmwareUpdateMdRequestGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3.FirmwareUpdateMdRequestGet)
            _ * firmwareUpdateMdRequestReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3.FirmwareUpdateMdRequestReport)
            _ * firmwareUpdateMdStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv3.FirmwareUpdateMdStatusReport)
        }
        return mock
    }

    FirmwareUpdateMdV4 createFirmwareUpdateMdV4Mock()
    {
        def mock = Mock(FirmwareUpdateMdV4)
        {
            _ * firmwareMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4.FirmwareMdGet)
            _ * firmwareMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4.FirmwareMdReport)
            _ * firmwareUpdateMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4.FirmwareUpdateMdGet)
            _ * firmwareUpdateMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4.FirmwareUpdateMdReport)
            _ * firmwareUpdateMdRequestGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4.FirmwareUpdateMdRequestGet)
            _ * firmwareUpdateMdRequestReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4.FirmwareUpdateMdRequestReport)
            _ * firmwareUpdateMdStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv4.FirmwareUpdateMdStatusReport)
        }
        return mock
    }

    FirmwareUpdateMdV5 createFirmwareUpdateMdV5Mock()
    {
        def mock = Mock(FirmwareUpdateMdV5)
        {
            _ * firmwareMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5.FirmwareMdGet)
            _ * firmwareMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5.FirmwareMdReport)
            _ * firmwareUpdateMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5.FirmwareUpdateMdGet)
            _ * firmwareUpdateMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5.FirmwareUpdateMdReport)
            _ * firmwareUpdateMdRequestGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5.FirmwareUpdateMdRequestGet)
            _ * firmwareUpdateMdRequestReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5.FirmwareUpdateMdRequestReport)
            _ * firmwareUpdateMdStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv5.FirmwareUpdateMdStatusReport)
        }
        return mock
    }

    FirmwareUpdateMdV6 createFirmwareUpdateMdV6Mock()
    {
        def mock = Mock(FirmwareUpdateMdV6)
        {
            _ * firmwareMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6.FirmwareMdGet)
            _ * firmwareMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6.FirmwareMdReport)
            _ * firmwareUpdateMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6.FirmwareUpdateMdGet)
            _ * firmwareUpdateMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6.FirmwareUpdateMdReport)
            _ * firmwareUpdateMdRequestGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6.FirmwareUpdateMdRequestGet)
            _ * firmwareUpdateMdRequestReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6.FirmwareUpdateMdRequestReport)
            _ * firmwareUpdateMdStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.firmwareupdatemdv6.FirmwareUpdateMdStatusReport)
        }
        return mock
    }

    GeographicLocationV1 createGeographicLocationV1Mock()
    {
        def mock = Mock(GeographicLocationV1)
        {
            _ * geographicLocationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.geographiclocationv1.GeographicLocationGet)
            _ * geographicLocationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.geographiclocationv1.GeographicLocationReport)
            _ * geographicLocationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.geographiclocationv1.GeographicLocationSet)
        }
        return mock
    }

    GroupingNameV1 createGroupingNameV1Mock()
    {
        def mock = Mock(GroupingNameV1)
        {
            _ * groupingNameGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.groupingnamev1.GroupingNameGet)
            _ * groupingNameReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.groupingnamev1.GroupingNameReport)
            _ * groupingNameSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.groupingnamev1.GroupingNameSet)
        }
        return mock
    }

    HailV1 createHailV1Mock()
    {
        def mock = Mock(HailV1)
        {
            _ * hail(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hailv1.Hail)
        }
        return mock
    }

    HrvControlV1 createHrvControlV1Mock()
    {
        def mock = Mock(HrvControlV1)
        {
            _ * hrvControlBypassGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlBypassGet)
            _ * hrvControlBypassReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlBypassReport)
            _ * hrvControlBypassSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlBypassSet)
            _ * hrvControlModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeGet)
            _ * hrvControlModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeReport)
            _ * hrvControlModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeSet)
            _ * hrvControlModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeSupportedGet)
            _ * hrvControlModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlModeSupportedReport)
            _ * hrvControlVentilationRateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlVentilationRateGet)
            _ * hrvControlVentilationRateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlVentilationRateReport)
            _ * hrvControlVentilationRateSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvcontrolv1.HrvControlVentilationRateSet)
        }
        return mock
    }

    HrvStatusV1 createHrvStatusV1Mock()
    {
        def mock = Mock(HrvStatusV1)
        {
            _ * hrvStatusGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1.HrvStatusGet)
            _ * hrvStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1.HrvStatusReport)
            _ * hrvStatusSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1.HrvStatusSupportedGet)
            _ * hrvStatusSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.hrvstatusv1.HrvStatusSupportedReport)
        }
        return mock
    }

    HumidityControlModeV1 createHumidityControlModeV1Mock()
    {
        def mock = Mock(HumidityControlModeV1)
        {
            _ * humidityControlModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev1.HumidityControlModeGet)
            _ * humidityControlModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev1.HumidityControlModeReport)
            _ * humidityControlModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev1.HumidityControlModeSet)
            _ * humidityControlModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev1.HumidityControlModeSupportedGet)
            _ * humidityControlModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev1.HumidityControlModeSupportedReport)
        }
        return mock
    }

    HumidityControlModeV2 createHumidityControlModeV2Mock()
    {
        def mock = Mock(HumidityControlModeV2)
        {
            _ * humidityControlModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeGet)
            _ * humidityControlModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeReport)
            _ * humidityControlModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeSet)
            _ * humidityControlModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeSupportedGet)
            _ * humidityControlModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolmodev2.HumidityControlModeSupportedReport)
        }
        return mock
    }

    HumidityControlOperatingStateV1 createHumidityControlOperatingStateV1Mock()
    {
        def mock = Mock(HumidityControlOperatingStateV1)
        {
            _ * humidityControlOperatingStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontroloperatingstatev1.HumidityControlOperatingStateGet)
            _ * humidityControlOperatingStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontroloperatingstatev1.HumidityControlOperatingStateReport)
        }
        return mock
    }

    HumidityControlSetpointV1 createHumidityControlSetpointV1Mock()
    {
        def mock = Mock(HumidityControlSetpointV1)
        {
            _ * humidityControlSetpointCapabilitiesGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointCapabilitiesGet)
            _ * humidityControlSetpointCapabilitiesReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointCapabilitiesReport)
            _ * humidityControlSetpointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointGet)
            _ * humidityControlSetpointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointReport)
            _ * humidityControlSetpointScaleSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointScaleSupportedGet)
            _ * humidityControlSetpointScaleSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointScaleSupportedReport)
            _ * humidityControlSetpointSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointSet)
            _ * humidityControlSetpointSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointSupportedGet)
            _ * humidityControlSetpointSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv1.HumidityControlSetpointSupportedReport)
        }
        return mock
    }

    HumidityControlSetpointV2 createHumidityControlSetpointV2Mock()
    {
        def mock = Mock(HumidityControlSetpointV2)
        {
            _ * humidityControlSetpointCapabilitiesGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointCapabilitiesGet)
            _ * humidityControlSetpointCapabilitiesReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointCapabilitiesReport)
            _ * humidityControlSetpointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointGet)
            _ * humidityControlSetpointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointReport)
            _ * humidityControlSetpointScaleSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointScaleSupportedGet)
            _ * humidityControlSetpointScaleSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointScaleSupportedReport)
            _ * humidityControlSetpointSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointSet)
            _ * humidityControlSetpointSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointSupportedGet)
            _ * humidityControlSetpointSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.humiditycontrolsetpointv2.HumidityControlSetpointSupportedReport)
        }
        return mock
    }

    IndicatorV1 createIndicatorV1Mock()
    {
        def mock = Mock(IndicatorV1)
        {
            _ * indicatorGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv1.IndicatorGet)
            _ * indicatorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv1.IndicatorReport)
            _ * indicatorSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv1.IndicatorSet)
        }
        return mock
    }

    IndicatorV2 createIndicatorV2Mock()
    {
        def mock = Mock(IndicatorV2)
        {
            _ * indicatorGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv2.IndicatorGet)
            _ * indicatorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv2.IndicatorReport)
            _ * indicatorSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv2.IndicatorSet)
            _ * indicatorSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv2.IndicatorSupportedGet)
            _ * indicatorSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv2.IndicatorSupportedReport)
        }
        return mock
    }

    IndicatorV3 createIndicatorV3Mock()
    {
        def mock = Mock(IndicatorV3)
        {
            _ * indicatorGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorGet)
            _ * indicatorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorReport)
            _ * indicatorSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorSet)
            _ * indicatorSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorSupportedGet)
            _ * indicatorSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.indicatorv3.IndicatorSupportedReport)
        }
        return mock
    }

    IpConfigurationV1 createIpConfigurationV1Mock()
    {
        def mock = Mock(IpConfigurationV1)
        {
            _ * ipConfigurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationGet)
            _ * ipConfigurationRelease(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationRelease)
            _ * ipConfigurationRenew(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationRenew)
            _ * ipConfigurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationReport)
            _ * ipConfigurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ipconfigurationv1.IpConfigurationSet)
        }
        return mock
    }

    IrrigationV1 createIrrigationV1Mock()
    {
        def mock = Mock(IrrigationV1)
        {
            _ * irrigationSystemConfigGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemConfigGet)
            _ * irrigationSystemConfigReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemConfigReport)
            _ * irrigationSystemConfigSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemConfigSet)
            _ * irrigationSystemInfoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemInfoGet)
            _ * irrigationSystemInfoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemInfoReport)
            _ * irrigationSystemShutoff(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemShutoff)
            _ * irrigationSystemStatusGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemStatusGet)
            _ * irrigationSystemStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationSystemStatusReport)
            _ * irrigationValveConfigGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveConfigGet)
            _ * irrigationValveConfigReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveConfigReport)
            _ * irrigationValveConfigSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveConfigSet)
            _ * irrigationValveInfoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveInfoGet)
            _ * irrigationValveInfoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveInfoReport)
            _ * irrigationValveRun(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveRun)
            _ * irrigationValveTableGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveTableGet)
            _ * irrigationValveTableReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveTableReport)
            _ * irrigationValveTableRun(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveTableRun)
            _ * irrigationValveTableSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.irrigationv1.IrrigationValveTableSet)
        }
        return mock
    }

    LanguageV1 createLanguageV1Mock()
    {
        def mock = Mock(LanguageV1)
        {
            _ * languageGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.languagev1.LanguageGet)
            _ * languageReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.languagev1.LanguageReport)
            _ * languageSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.languagev1.LanguageSet)
        }
        return mock
    }

    LockV1 createLockV1Mock()
    {
        def mock = Mock(LockV1)
        {
            _ * lockGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.lockv1.LockGet)
            _ * lockReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.lockv1.LockReport)
            _ * lockSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.lockv1.LockSet)
        }
        return mock
    }

    ManufacturerSpecificV1 createManufacturerSpecificV1Mock()
    {
        def mock = Mock(ManufacturerSpecificV1)
        {
            _ * manufacturerSpecificGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv1.ManufacturerSpecificGet)
            _ * manufacturerSpecificReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv1.ManufacturerSpecificReport)
        }
        return mock
    }

    ManufacturerSpecificV2 createManufacturerSpecificV2Mock()
    {
        def mock = Mock(ManufacturerSpecificV2)
        {
            _ * deviceSpecificGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2.DeviceSpecificGet)
            _ * deviceSpecificReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2.DeviceSpecificReport)
            _ * manufacturerSpecificGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2.ManufacturerSpecificGet)
            _ * manufacturerSpecificReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.manufacturerspecificv2.ManufacturerSpecificReport)
        }
        return mock
    }

    MeterPulseV1 createMeterPulseV1Mock()
    {
        def mock = Mock(MeterPulseV1)
        {
            _ * meterPulseGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterpulsev1.MeterPulseGet)
            _ * meterPulseReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterpulsev1.MeterPulseReport)
        }
        return mock
    }

    MeterTblConfigV1 createMeterTblConfigV1Mock()
    {
        def mock = Mock(MeterTblConfigV1)
        {
            _ * meterTblTablePointAdmNoSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblconfigv1.MeterTblTablePointAdmNoSet)
        }
        return mock
    }

    MeterTblMonitorV1 createMeterTblMonitorV1Mock()
    {
        def mock = Mock(MeterTblMonitorV1)
        {
            _ * meterTblCurrentDataGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblCurrentDataGet)
            _ * meterTblCurrentDataReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblCurrentDataReport)
            _ * meterTblHistoricalDataGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblHistoricalDataGet)
            _ * meterTblHistoricalDataReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblHistoricalDataReport)
            _ * meterTblReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblReport)
            _ * meterTblStatusDateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblStatusDateGet)
            _ * meterTblStatusDepthGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblStatusDepthGet)
            _ * meterTblStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblStatusReport)
            _ * meterTblStatusSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblStatusSupportedGet)
            _ * meterTblStatusSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblStatusSupportedReport)
            _ * meterTblTableCapabilityGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblTableCapabilityGet)
            _ * meterTblTableIdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblTableIdGet)
            _ * meterTblTableIdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblTableIdReport)
            _ * meterTblTablePointAdmNoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblTablePointAdmNoGet)
            _ * meterTblTablePointAdmNoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv1.MeterTblTablePointAdmNoReport)
        }
        return mock
    }

    MeterTblMonitorV2 createMeterTblMonitorV2Mock()
    {
        def mock = Mock(MeterTblMonitorV2)
        {
            _ * meterTblCurrentDataGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblCurrentDataGet)
            _ * meterTblCurrentDataReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblCurrentDataReport)
            _ * meterTblHistoricalDataGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblHistoricalDataGet)
            _ * meterTblHistoricalDataReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblHistoricalDataReport)
            _ * meterTblReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblReport)
            _ * meterTblStatusDateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusDateGet)
            _ * meterTblStatusDepthGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusDepthGet)
            _ * meterTblStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusReport)
            _ * meterTblStatusSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusSupportedGet)
            _ * meterTblStatusSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblStatusSupportedReport)
            _ * meterTblTableCapabilityGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTableCapabilityGet)
            _ * meterTblTableIdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTableIdGet)
            _ * meterTblTableIdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTableIdReport)
            _ * meterTblTablePointAdmNoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTablePointAdmNoGet)
            _ * meterTblTablePointAdmNoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblmonitorv2.MeterTblTablePointAdmNoReport)
        }
        return mock
    }

    MeterTblPushV1 createMeterTblPushV1Mock()
    {
        def mock = Mock(MeterTblPushV1)
        {
            _ * meterTblPushConfigurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblpushv1.MeterTblPushConfigurationGet)
            _ * meterTblPushConfigurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblpushv1.MeterTblPushConfigurationReport)
            _ * meterTblPushConfigurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.metertblpushv1.MeterTblPushConfigurationSet)
        }
        return mock
    }

    MeterV1 createMeterV1Mock()
    {
        def mock = Mock(MeterV1)
        {
            _ * meterGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv1.MeterGet)
            _ * meterReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv1.MeterReport)
        }
        return mock
    }

    MeterV2 createMeterV2Mock()
    {
        def mock = Mock(MeterV2)
        {
            _ * meterGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv2.MeterGet)
            _ * meterReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv2.MeterReport)
            _ * meterReset(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv2.MeterReset)
            _ * meterSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv2.MeterSupportedGet)
            _ * meterSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv2.MeterSupportedReport)
        }
        return mock
    }

    MeterV3 createMeterV3Mock()
    {
        def mock = Mock(MeterV3)
        {
            _ * meterGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterGet)
            _ * meterReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterReport)
            _ * meterReset(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterReset)
            _ * meterSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterSupportedGet)
            _ * meterSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv3.MeterSupportedReport)
        }
        return mock
    }

    MeterV4 createMeterV4Mock()
    {
        def mock = Mock(MeterV4)
        {
            _ * meterGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv4.MeterGet)
            _ * meterReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv4.MeterReport)
            _ * meterReset(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv4.MeterReset)
            _ * meterSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv4.MeterSupportedGet)
            _ * meterSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv4.MeterSupportedReport)
        }
        return mock
    }

    MeterV5 createMeterV5Mock()
    {
        def mock = Mock(MeterV5)
        {
            _ * meterGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv5.MeterGet)
            _ * meterReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv5.MeterReport)
            _ * meterReset(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv5.MeterReset)
            _ * meterSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv5.MeterSupportedGet)
            _ * meterSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.meterv5.MeterSupportedReport)
        }
        return mock
    }

    MtpWindowCoveringV1 createMtpWindowCoveringV1Mock()
    {
        def mock = Mock(MtpWindowCoveringV1)
        {
            _ * moveToPositionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.mtpwindowcoveringv1.MoveToPositionGet)
            _ * moveToPositionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.mtpwindowcoveringv1.MoveToPositionReport)
            _ * moveToPositionSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.mtpwindowcoveringv1.MoveToPositionSet)
        }
        return mock
    }

    MultiChannelAssociationV2 createMultiChannelAssociationV2Mock()
    {
        def mock = Mock(MultiChannelAssociationV2)
        {
            _ * multiChannelAssociationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationGet)
            _ * multiChannelAssociationGroupingsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationGroupingsGet)
            _ * multiChannelAssociationGroupingsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationGroupingsReport)
            _ * multiChannelAssociationRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationRemove)
            _ * multiChannelAssociationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationReport)
            _ * multiChannelAssociationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv2.MultiChannelAssociationSet)
        }
        return mock
    }

    MultiChannelAssociationV3 createMultiChannelAssociationV3Mock()
    {
        def mock = Mock(MultiChannelAssociationV3)
        {
            _ * multiChannelAssociationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv3.MultiChannelAssociationGet)
            _ * multiChannelAssociationGroupingsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv3.MultiChannelAssociationGroupingsGet)
            _ * multiChannelAssociationGroupingsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv3.MultiChannelAssociationGroupingsReport)
            _ * multiChannelAssociationRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv3.MultiChannelAssociationRemove)
            _ * multiChannelAssociationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv3.MultiChannelAssociationReport)
            _ * multiChannelAssociationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv3.MultiChannelAssociationSet)
        }
        return mock
    }

    MultiChannelAssociationV4 createMultiChannelAssociationV4Mock()
    {
        def mock = Mock(MultiChannelAssociationV4)
        {
            _ * multiChannelAssociationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationGet)
            _ * multiChannelAssociationGroupingsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationGroupingsGet)
            _ * multiChannelAssociationGroupingsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationGroupingsReport)
            _ * multiChannelAssociationRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationRemove)
            _ * multiChannelAssociationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationReport)
            _ * multiChannelAssociationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelassociationv4.MultiChannelAssociationSet)
        }
        return mock
    }

    MultiChannelV2 createMultiChannelV2Mock()
    {
        def multiChannelCmdEncapMock = Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelCmdEncap)
        {
            _ * encapsulate(_ as Command) >> { cmd -> return Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelCmdEncap) }
        }
        def mock = Mock(MultiChannelV2)
        {
            _ * multiChannelCapabilityGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelCapabilityGet)
            _ * multiChannelCapabilityReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelCapabilityReport)
            _ * multiChannelCmdEncap(*_) >> multiChannelCmdEncapMock
            _ * multiChannelEndPointFind(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelEndPointFind)
            _ * multiChannelEndPointFindReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelEndPointFindReport)
            _ * multiChannelEndPointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelEndPointGet)
            _ * multiChannelEndPointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv2.MultiChannelEndPointReport)
        }
        return mock
    }

    MultiChannelV3 createMultiChannelV3Mock()
    {
        def multiChannelCmdEncapMock = Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3.MultiChannelCmdEncap)
        {
            _ * encapsulate(_ as Command) >> { cmd -> return Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3.MultiChannelCmdEncap) }
        }
        def mock = Mock(MultiChannelV3)
        {
            _ * multiChannelCapabilityGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3.MultiChannelCapabilityGet)
            _ * multiChannelCapabilityReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3.MultiChannelCapabilityReport)
            _ * multiChannelCmdEncap(*_) >> multiChannelCmdEncapMock
            _ * multiChannelEndPointFind(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3.MultiChannelEndPointFind)
            _ * multiChannelEndPointFindReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3.MultiChannelEndPointFindReport)
            _ * multiChannelEndPointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3.MultiChannelEndPointGet)
            _ * multiChannelEndPointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv3.MultiChannelEndPointReport)
        }
        return mock
    }

    MultiChannelV4 createMultiChannelV4Mock()
    {
        def multiChannelCmdEncapMock = Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelCmdEncap)
        {
            _ * encapsulate(_ as Command) >> { cmd -> return Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelCmdEncap) }
        }
        def mock = Mock(MultiChannelV4)
        {
            _ * multiChannelAggregatedMembersGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelAggregatedMembersGet)
            _ * multiChannelAggregatedMembersReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelAggregatedMembersReport)
            _ * multiChannelCapabilityGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelCapabilityGet)
            _ * multiChannelCapabilityReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelCapabilityReport)
            _ * multiChannelCmdEncap(*_) >> multiChannelCmdEncapMock
            _ * multiChannelEndPointFind(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelEndPointFind)
            _ * multiChannelEndPointFindReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelEndPointFindReport)
            _ * multiChannelEndPointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelEndPointGet)
            _ * multiChannelEndPointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multichannelv4.MultiChannelEndPointReport)
        }
        return mock
    }

    MultiCmdV1 createMultiCmdV1Mock()
    {
        def mock = Mock(MultiCmdV1)
        {
            _ * multiCmdEncap(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multicmdv1.MultiCmdEncap)
        }
        return mock
    }

    MultiInstanceAssociationV1 createMultiInstanceAssociationV1Mock()
    {
        def mock = Mock(MultiInstanceAssociationV1)
        {
            _ * multiInstanceAssociationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationGet)
            _ * multiInstanceAssociationGroupingsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationGroupingsGet)
            _ * multiInstanceAssociationGroupingsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationGroupingsReport)
            _ * multiInstanceAssociationRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationRemove)
            _ * multiInstanceAssociationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationReport)
            _ * multiInstanceAssociationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstanceassociationv1.MultiInstanceAssociationSet)
        }
        return mock
    }

    MultiInstanceV1 createMultiInstanceV1Mock()
    {
        def mock = Mock(MultiInstanceV1)
        {
            _ * multiInstanceCmdEncap(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstancev1.MultiInstanceCmdEncap)
            _ * multiInstanceGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstancev1.MultiInstanceGet)
            _ * multiInstanceReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.multiinstancev1.MultiInstanceReport)
        }
        return mock
    }

    NetworkManagementInstallationMaintenanceV1 createNetworkManagementInstallationMaintenanceV1Mock()
    {
        def mock = Mock(NetworkManagementInstallationMaintenanceV1)
        {
            _ * priorityRouteGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.PriorityRouteGet)
            _ * priorityRouteReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.PriorityRouteReport)
            _ * priorityRouteSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.PriorityRouteSet)
            _ * statisticsClear(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.StatisticsClear)
            _ * statisticsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.StatisticsGet)
            _ * statisticsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev1.StatisticsReport)
        }
        return mock
    }

    NetworkManagementInstallationMaintenanceV2 createNetworkManagementInstallationMaintenanceV2Mock()
    {
        def mock = Mock(NetworkManagementInstallationMaintenanceV2)
        {
            _ * priorityRouteGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.PriorityRouteGet)
            _ * priorityRouteReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.PriorityRouteReport)
            _ * priorityRouteSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.PriorityRouteSet)
            _ * rssiGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.RssiGet)
            _ * rssiReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.RssiReport)
            _ * statisticsClear(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.StatisticsClear)
            _ * statisticsGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.StatisticsGet)
            _ * statisticsReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.networkmanagementinstallationmaintenancev2.StatisticsReport)
        }
        return mock
    }

    NodeNamingV1 createNodeNamingV1Mock()
    {
        def mock = Mock(NodeNamingV1)
        {
            _ * nodeNamingNodeLocationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeLocationGet)
            _ * nodeNamingNodeLocationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeLocationReport)
            _ * nodeNamingNodeLocationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeLocationSet)
            _ * nodeNamingNodeNameGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeNameGet)
            _ * nodeNamingNodeNameReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeNameReport)
            _ * nodeNamingNodeNameSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.nodenamingv1.NodeNamingNodeNameSet)
        }
        return mock
    }

    NotificationV3 createNotificationV3Mock()
    {
        def mock = Mock(NotificationV3)
        {
            _ * eventSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv3.EventSupportedGet)
            _ * eventSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv3.EventSupportedReport)
            _ * notificationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv3.NotificationGet)
            _ * notificationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv3.NotificationReport)
            _ * notificationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv3.NotificationSet)
            _ * notificationSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv3.NotificationSupportedGet)
            _ * notificationSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv3.NotificationSupportedReport)
        }
        return mock
    }

    NotificationV4 createNotificationV4Mock()
    {
        def mock = Mock(NotificationV4)
        {
            _ * eventSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv4.EventSupportedGet)
            _ * eventSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv4.EventSupportedReport)
            _ * notificationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv4.NotificationGet)
            _ * notificationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv4.NotificationReport)
            _ * notificationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv4.NotificationSet)
            _ * notificationSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv4.NotificationSupportedGet)
            _ * notificationSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv4.NotificationSupportedReport)
        }
        return mock
    }

    NotificationV5 createNotificationV5Mock()
    {
        def mock = Mock(NotificationV5)
        {
            _ * eventSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.EventSupportedGet)
            _ * eventSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.EventSupportedReport)
            _ * notificationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationGet)
            _ * notificationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationReport)
            _ * notificationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationSet)
            _ * notificationSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationSupportedGet)
            _ * notificationSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv5.NotificationSupportedReport)
        }
        return mock
    }

    NotificationV6 createNotificationV6Mock()
    {
        def mock = Mock(NotificationV6)
        {
            _ * eventSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6.EventSupportedGet)
            _ * eventSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6.EventSupportedReport)
            _ * notificationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6.NotificationGet)
            _ * notificationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6.NotificationReport)
            _ * notificationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6.NotificationSet)
            _ * notificationSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6.NotificationSupportedGet)
            _ * notificationSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv6.NotificationSupportedReport)
        }
        return mock
    }

    NotificationV7 createNotificationV7Mock()
    {
        def mock = Mock(NotificationV7)
        {
            _ * eventSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv7.EventSupportedGet)
            _ * eventSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv7.EventSupportedReport)
            _ * notificationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv7.NotificationGet)
            _ * notificationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv7.NotificationReport)
            _ * notificationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv7.NotificationSet)
            _ * notificationSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv7.NotificationSupportedGet)
            _ * notificationSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv7.NotificationSupportedReport)
        }
        return mock
    }

    NotificationV8 createNotificationV8Mock()
    {
        def mock = Mock(NotificationV8)
        {
            _ * eventSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.EventSupportedGet)
            _ * eventSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.EventSupportedReport)
            _ * notificationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationGet)
            _ * notificationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationReport)
            _ * notificationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationSet)
            _ * notificationSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationSupportedGet)
            _ * notificationSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.notificationv8.NotificationSupportedReport)
        }
        return mock
    }

    PowerlevelV1 createPowerlevelV1Mock()
    {
        def mock = Mock(PowerlevelV1)
        {
            _ * powerlevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelGet)
            _ * powerlevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelReport)
            _ * powerlevelSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelSet)
            _ * powerlevelTestNodeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelTestNodeGet)
            _ * powerlevelTestNodeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelTestNodeReport)
            _ * powerlevelTestNodeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.powerlevelv1.PowerlevelTestNodeSet)
        }
        return mock
    }

    PrepaymentEncapsulationV1 createPrepaymentEncapsulationV1Mock()
    {
        def mock = Mock(PrepaymentEncapsulationV1)
        {
            _ * cmdEncapsulation(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentencapsulationv1.CmdEncapsulation)
        }
        return mock
    }

    PrepaymentV1 createPrepaymentV1Mock()
    {
        def mock = Mock(PrepaymentV1)
        {
            _ * prepaymentBalanceGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1.PrepaymentBalanceGet)
            _ * prepaymentBalanceReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1.PrepaymentBalanceReport)
            _ * prepaymentSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1.PrepaymentSupportedGet)
            _ * prepaymentSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.prepaymentv1.PrepaymentSupportedReport)
        }
        return mock
    }

    ProprietaryV1 createProprietaryV1Mock()
    {
        def mock = Mock(ProprietaryV1)
        {
            _ * proprietaryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.proprietaryv1.ProprietaryGet)
            _ * proprietaryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.proprietaryv1.ProprietaryReport)
            _ * proprietarySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.proprietaryv1.ProprietarySet)
        }
        return mock
    }

    ProtectionV1 createProtectionV1Mock()
    {
        def mock = Mock(ProtectionV1)
        {
            _ * protectionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv1.ProtectionGet)
            _ * protectionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv1.ProtectionReport)
            _ * protectionSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv1.ProtectionSet)
        }
        return mock
    }

    ProtectionV2 createProtectionV2Mock()
    {
        def mock = Mock(ProtectionV2)
        {
            _ * protectionEcGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionEcGet)
            _ * protectionEcReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionEcReport)
            _ * protectionEcSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionEcSet)
            _ * protectionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionGet)
            _ * protectionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionReport)
            _ * protectionSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionSet)
            _ * protectionSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionSupportedGet)
            _ * protectionSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionSupportedReport)
            _ * protectionTimeoutGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionTimeoutGet)
            _ * protectionTimeoutReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionTimeoutReport)
            _ * protectionTimeoutSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.protectionv2.ProtectionTimeoutSet)
        }
        return mock
    }

    RateTblConfigV1 createRateTblConfigV1Mock()
    {
        def mock = Mock(RateTblConfigV1)
        {
            _ * rateTblRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblconfigv1.RateTblRemove)
            _ * rateTblSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblconfigv1.RateTblSet)
        }
        return mock
    }

    RateTblMonitorV1 createRateTblMonitorV1Mock()
    {
        def mock = Mock(RateTblMonitorV1)
        {
            _ * rateTblActiveRateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblActiveRateGet)
            _ * rateTblActiveRateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblActiveRateReport)
            _ * rateTblCurrentDataGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblCurrentDataGet)
            _ * rateTblCurrentDataReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblCurrentDataReport)
            _ * rateTblGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblGet)
            _ * rateTblHistoricalDataGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblHistoricalDataGet)
            _ * rateTblHistoricalDataReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblHistoricalDataReport)
            _ * rateTblReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblReport)
            _ * rateTblSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblSupportedGet)
            _ * rateTblSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.ratetblmonitorv1.RateTblSupportedReport)
        }
        return mock
    }

    RemoteAssociationActivateV1 createRemoteAssociationActivateV1Mock()
    {
        def mock = Mock(RemoteAssociationActivateV1)
        {
            _ * remoteAssociationActivate(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationactivatev1.RemoteAssociationActivate)
        }
        return mock
    }

    RemoteAssociationV1 createRemoteAssociationV1Mock()
    {
        def mock = Mock(RemoteAssociationV1)
        {
            _ * remoteAssociationConfigurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationv1.RemoteAssociationConfigurationGet)
            _ * remoteAssociationConfigurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationv1.RemoteAssociationConfigurationReport)
            _ * remoteAssociationConfigurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.remoteassociationv1.RemoteAssociationConfigurationSet)
        }
        return mock
    }

    SceneActivationV1 createSceneActivationV1Mock()
    {
        def mock = Mock(SceneActivationV1)
        {
            _ * sceneActivationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactivationv1.SceneActivationSet)
        }
        return mock
    }

    SceneActuatorConfV1 createSceneActuatorConfV1Mock()
    {
        def mock = Mock(SceneActuatorConfV1)
        {
            _ * sceneActuatorConfGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1.SceneActuatorConfGet)
            _ * sceneActuatorConfReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1.SceneActuatorConfReport)
            _ * sceneActuatorConfSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sceneactuatorconfv1.SceneActuatorConfSet)
        }
        return mock
    }

    SceneControllerConfV1 createSceneControllerConfV1Mock()
    {
        def mock = Mock(SceneControllerConfV1)
        {
            _ * sceneControllerConfGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scenecontrollerconfv1.SceneControllerConfGet)
            _ * sceneControllerConfReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scenecontrollerconfv1.SceneControllerConfReport)
            _ * sceneControllerConfSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scenecontrollerconfv1.SceneControllerConfSet)
        }
        return mock
    }

    ScheduleEntryLockV1 createScheduleEntryLockV1Mock()
    {
        def mock = Mock(ScheduleEntryLockV1)
        {
            _ * scheduleEntryLockEnableAllSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockEnableAllSet)
            _ * scheduleEntryLockEnableSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockEnableSet)
            _ * scheduleEntryLockWeekDayGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockWeekDayGet)
            _ * scheduleEntryLockWeekDayReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockWeekDayReport)
            _ * scheduleEntryLockWeekDaySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockWeekDaySet)
            _ * scheduleEntryLockYearDayGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockYearDayGet)
            _ * scheduleEntryLockYearDayReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockYearDayReport)
            _ * scheduleEntryLockYearDaySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryLockYearDaySet)
            _ * scheduleEntryTypeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryTypeSupportedGet)
            _ * scheduleEntryTypeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv1.ScheduleEntryTypeSupportedReport)
        }
        return mock
    }

    ScheduleEntryLockV2 createScheduleEntryLockV2Mock()
    {
        def mock = Mock(ScheduleEntryLockV2)
        {
            _ * scheduleEntryLockEnableAllSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockEnableAllSet)
            _ * scheduleEntryLockEnableSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockEnableSet)
            _ * scheduleEntryLockTimeOffsetGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockTimeOffsetGet)
            _ * scheduleEntryLockTimeOffsetReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockTimeOffsetReport)
            _ * scheduleEntryLockTimeOffsetSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockTimeOffsetSet)
            _ * scheduleEntryLockWeekDayGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockWeekDayGet)
            _ * scheduleEntryLockWeekDayReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockWeekDayReport)
            _ * scheduleEntryLockWeekDaySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockWeekDaySet)
            _ * scheduleEntryLockYearDayGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockYearDayGet)
            _ * scheduleEntryLockYearDayReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockYearDayReport)
            _ * scheduleEntryLockYearDaySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryLockYearDaySet)
            _ * scheduleEntryTypeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryTypeSupportedGet)
            _ * scheduleEntryTypeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv2.ScheduleEntryTypeSupportedReport)
        }
        return mock
    }

    ScheduleEntryLockV3 createScheduleEntryLockV3Mock()
    {
        def mock = Mock(ScheduleEntryLockV3)
        {
            _ * scheduleEntryLockDailyRepeatingGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockDailyRepeatingGet)
            _ * scheduleEntryLockDailyRepeatingReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockDailyRepeatingReport)
            _ * scheduleEntryLockDailyRepeatingSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockDailyRepeatingSet)
            _ * scheduleEntryLockEnableAllSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockEnableAllSet)
            _ * scheduleEntryLockEnableSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockEnableSet)
            _ * scheduleEntryLockTimeOffsetGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockTimeOffsetGet)
            _ * scheduleEntryLockTimeOffsetReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockTimeOffsetReport)
            _ * scheduleEntryLockTimeOffsetSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockTimeOffsetSet)
            _ * scheduleEntryLockWeekDayGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockWeekDayGet)
            _ * scheduleEntryLockWeekDayReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockWeekDayReport)
            _ * scheduleEntryLockWeekDaySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockWeekDaySet)
            _ * scheduleEntryLockYearDayGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockYearDayGet)
            _ * scheduleEntryLockYearDayReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockYearDayReport)
            _ * scheduleEntryLockYearDaySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryLockYearDaySet)
            _ * scheduleEntryTypeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryTypeSupportedGet)
            _ * scheduleEntryTypeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.scheduleentrylockv3.ScheduleEntryTypeSupportedReport)
        }
        return mock
    }

    ScheduleV1 createScheduleV1Mock()
    {
        def mock = Mock(ScheduleV1)
        {
            _ * commandScheduleGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.CommandScheduleGet)
            _ * commandScheduleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.CommandScheduleReport)
            _ * commandScheduleSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.CommandScheduleSet)
            _ * scheduleRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleRemove)
            _ * scheduleStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleStateGet)
            _ * scheduleStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleStateReport)
            _ * scheduleStateSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleStateSet)
            _ * scheduleSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleSupportedGet)
            _ * scheduleSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.schedulev1.ScheduleSupportedReport)
        }
        return mock
    }

    ScreenAttributesV1 createScreenAttributesV1Mock()
    {
        def mock = Mock(ScreenAttributesV1)
        {
            _ * screenAttributesGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv1.ScreenAttributesGet)
            _ * screenAttributesReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv1.ScreenAttributesReport)
        }
        return mock
    }

    ScreenAttributesV2 createScreenAttributesV2Mock()
    {
        def mock = Mock(ScreenAttributesV2)
        {
            _ * screenAttributesGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv2.ScreenAttributesGet)
            _ * screenAttributesReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenattributesv2.ScreenAttributesReport)
        }
        return mock
    }

    ScreenMdV1 createScreenMdV1Mock()
    {
        def mock = Mock(ScreenMdV1)
        {
            _ * screenMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv1.ScreenMdGet)
            _ * screenMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv1.ScreenMdReport)
        }
        return mock
    }

    ScreenMdV2 createScreenMdV2Mock()
    {
        def mock = Mock(ScreenMdV2)
        {
            _ * screenMdGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv2.ScreenMdGet)
            _ * screenMdReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.screenmdv2.ScreenMdReport)
        }
        return mock
    }

    Security2V1 createSecurity2V1Mock()
    {
        def mock = Mock(Security2V1)
        {
            _ * kexFail(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.KexFail)
            _ * kexGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.KexGet)
            _ * kexReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.KexReport)
            _ * kexSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.KexSet)
            _ * publicKeyReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.PublicKeyReport)
            _ * security2CommandsSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2CommandsSupportedGet)
            _ * security2CommandsSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2CommandsSupportedReport)
            _ * security2MessageEncapsulation(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2MessageEncapsulation)
            _ * security2NetworkKeyGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NetworkKeyGet)
            _ * security2NetworkKeyReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NetworkKeyReport)
            _ * security2NetworkKeyVerify(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NetworkKeyVerify)
            _ * security2NonceGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NonceGet)
            _ * security2NonceReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2NonceReport)
            _ * security2TransferEnd(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.security2v1.Security2TransferEnd)
        }
        return mock
    }

    SecurityPanelModeV1 createSecurityPanelModeV1Mock()
    {
        def mock = Mock(SecurityPanelModeV1)
        {
            _ * securityPanelModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeGet)
            _ * securityPanelModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeReport)
            _ * securityPanelModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeSet)
            _ * securityPanelModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeSupportedGet)
            _ * securityPanelModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelmodev1.SecurityPanelModeSupportedReport)
        }
        return mock
    }

    SecurityPanelZoneSensorV1 createSecurityPanelZoneSensorV1Mock()
    {
        def mock = Mock(SecurityPanelZoneSensorV1)
        {
            _ * commandClassSecurityPanelZoneSensorInstalledReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1.CommandClassSecurityPanelZoneSensorInstalledReport)
            _ * securityPanelZoneSensorInstalledGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1.SecurityPanelZoneSensorInstalledGet)
            _ * securityPanelZoneSensorStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1.SecurityPanelZoneSensorStateGet)
            _ * securityPanelZoneSensorStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1.SecurityPanelZoneSensorStateReport)
            _ * securityPanelZoneSensorTypeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1.SecurityPanelZoneSensorTypeGet)
            _ * securityPanelZoneSensorTypeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonesensorv1.SecurityPanelZoneSensorTypeReport)
        }
        return mock
    }

    SecurityPanelZoneV1 createSecurityPanelZoneV1Mock()
    {
        def mock = Mock(SecurityPanelZoneV1)
        {
            _ * securityPanelZoneNumberSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneNumberSupportedGet)
            _ * securityPanelZoneStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneStateGet)
            _ * securityPanelZoneStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneStateReport)
            _ * securityPanelZoneSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneSupportedReport)
            _ * securityPanelZoneTypeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneTypeGet)
            _ * securityPanelZoneTypeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securitypanelzonev1.SecurityPanelZoneTypeReport)
        }
        return mock
    }

    SecurityV1 createSecurityV1Mock()
    {
        def securityMessageEncapsulationMock = Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityMessageEncapsulation)
        {
            _ * encapsulate(_ as Command) >> { cmd -> return Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityMessageEncapsulation) }
        }
        def mock = Mock(SecurityV1)
        {
            _ * networkKeySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.NetworkKeySet)
            _ * networkKeyVerify(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.NetworkKeyVerify)
            _ * securityCommandsSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityCommandsSupportedGet)
            _ * securityCommandsSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityCommandsSupportedReport)
            _ * securityMessageEncapsulation(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityMessageEncapsulation)
            _ * securityMessageEncapsulationNonceGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityMessageEncapsulationNonceGet)
            _ * securityNonceGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityNonceGet)
            _ * securityNonceReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecurityNonceReport)
            _ * securitySchemeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecuritySchemeGet)
            _ * securitySchemeInherit(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecuritySchemeInherit)
            _ * securitySchemeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.securityv1.SecuritySchemeReport)
        }
        return mock
    }

    SensorAlarmV1 createSensorAlarmV1Mock()
    {
        def mock = Mock(SensorAlarmV1)
        {
            _ * sensorAlarmGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1.SensorAlarmGet)
            _ * sensorAlarmReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1.SensorAlarmReport)
            _ * sensorAlarmSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1.SensorAlarmSupportedGet)
            _ * sensorAlarmSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensoralarmv1.SensorAlarmSupportedReport)
        }
        return mock
    }

    SensorBinaryV1 createSensorBinaryV1Mock()
    {
        def mock = Mock(SensorBinaryV1)
        {
            _ * sensorBinaryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv1.SensorBinaryGet)
            _ * sensorBinaryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv1.SensorBinaryReport)
        }
        return mock
    }

    SensorBinaryV2 createSensorBinaryV2Mock()
    {
        def mock = Mock(SensorBinaryV2)
        {
            _ * sensorBinaryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2.SensorBinaryGet)
            _ * sensorBinaryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2.SensorBinaryReport)
            _ * sensorBinarySupportedGetSensor(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2.SensorBinarySupportedGetSensor)
            _ * sensorBinarySupportedSensorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorbinaryv2.SensorBinarySupportedSensorReport)
        }
        return mock
    }

    SensorConfigurationV1 createSensorConfigurationV1Mock()
    {
        def mock = Mock(SensorConfigurationV1)
        {
            _ * sensorTriggerLevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorconfigurationv1.SensorTriggerLevelGet)
            _ * sensorTriggerLevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorconfigurationv1.SensorTriggerLevelReport)
            _ * sensorTriggerLevelSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensorconfigurationv1.SensorTriggerLevelSet)
        }
        return mock
    }

    SensorMultilevelV1 createSensorMultilevelV1Mock()
    {
        def mock = Mock(SensorMultilevelV1)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv1.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv1.SensorMultilevelReport)
        }
        return mock
    }

    SensorMultilevelV10 createSensorMultilevelV10Mock()
    {
        def mock = Mock(SensorMultilevelV10)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv10.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv10.SensorMultilevelReport)
            _ * sensorMultilevelSupportedGetScale(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv10.SensorMultilevelSupportedGetScale)
            _ * sensorMultilevelSupportedGetSensor(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv10.SensorMultilevelSupportedGetSensor)
            _ * sensorMultilevelSupportedScaleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv10.SensorMultilevelSupportedScaleReport)
            _ * sensorMultilevelSupportedSensorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv10.SensorMultilevelSupportedSensorReport)
        }
        return mock
    }

    SensorMultilevelV11 createSensorMultilevelV11Mock()
    {
        def mock = Mock(SensorMultilevelV11)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv11.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv11.SensorMultilevelReport)
            _ * sensorMultilevelSupportedGetScale(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv11.SensorMultilevelSupportedGetScale)
            _ * sensorMultilevelSupportedGetSensor(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv11.SensorMultilevelSupportedGetSensor)
            _ * sensorMultilevelSupportedScaleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv11.SensorMultilevelSupportedScaleReport)
            _ * sensorMultilevelSupportedSensorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv11.SensorMultilevelSupportedSensorReport)
        }
        return mock
    }

    SensorMultilevelV2 createSensorMultilevelV2Mock()
    {
        def mock = Mock(SensorMultilevelV2)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv2.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv2.SensorMultilevelReport)
        }
        return mock
    }

    SensorMultilevelV3 createSensorMultilevelV3Mock()
    {
        def mock = Mock(SensorMultilevelV3)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv3.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv3.SensorMultilevelReport)
        }
        return mock
    }

    SensorMultilevelV4 createSensorMultilevelV4Mock()
    {
        def mock = Mock(SensorMultilevelV4)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv4.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv4.SensorMultilevelReport)
        }
        return mock
    }

    SensorMultilevelV5 createSensorMultilevelV5Mock()
    {
        def mock = Mock(SensorMultilevelV5)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelReport)
            _ * sensorMultilevelSupportedGetScale(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelSupportedGetScale)
            _ * sensorMultilevelSupportedGetSensor(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelSupportedGetSensor)
            _ * sensorMultilevelSupportedScaleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelSupportedScaleReport)
            _ * sensorMultilevelSupportedSensorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv5.SensorMultilevelSupportedSensorReport)
        }
        return mock
    }

    SensorMultilevelV6 createSensorMultilevelV6Mock()
    {
        def mock = Mock(SensorMultilevelV6)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv6.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv6.SensorMultilevelReport)
            _ * sensorMultilevelSupportedGetScale(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv6.SensorMultilevelSupportedGetScale)
            _ * sensorMultilevelSupportedGetSensor(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv6.SensorMultilevelSupportedGetSensor)
            _ * sensorMultilevelSupportedScaleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv6.SensorMultilevelSupportedScaleReport)
            _ * sensorMultilevelSupportedSensorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv6.SensorMultilevelSupportedSensorReport)
        }
        return mock
    }

    SensorMultilevelV7 createSensorMultilevelV7Mock()
    {
        def mock = Mock(SensorMultilevelV7)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelReport)
            _ * sensorMultilevelSupportedGetScale(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelSupportedGetScale)
            _ * sensorMultilevelSupportedGetSensor(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelSupportedGetSensor)
            _ * sensorMultilevelSupportedScaleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelSupportedScaleReport)
            _ * sensorMultilevelSupportedSensorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv7.SensorMultilevelSupportedSensorReport)
        }
        return mock
    }

    SensorMultilevelV8 createSensorMultilevelV8Mock()
    {
        def mock = Mock(SensorMultilevelV8)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv8.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv8.SensorMultilevelReport)
            _ * sensorMultilevelSupportedGetScale(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv8.SensorMultilevelSupportedGetScale)
            _ * sensorMultilevelSupportedGetSensor(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv8.SensorMultilevelSupportedGetSensor)
            _ * sensorMultilevelSupportedScaleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv8.SensorMultilevelSupportedScaleReport)
            _ * sensorMultilevelSupportedSensorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv8.SensorMultilevelSupportedSensorReport)
        }
        return mock
    }

    SensorMultilevelV9 createSensorMultilevelV9Mock()
    {
        def mock = Mock(SensorMultilevelV9)
        {
            _ * sensorMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv9.SensorMultilevelGet)
            _ * sensorMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv9.SensorMultilevelReport)
            _ * sensorMultilevelSupportedGetScale(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv9.SensorMultilevelSupportedGetScale)
            _ * sensorMultilevelSupportedGetSensor(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv9.SensorMultilevelSupportedGetSensor)
            _ * sensorMultilevelSupportedScaleReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv9.SensorMultilevelSupportedScaleReport)
            _ * sensorMultilevelSupportedSensorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv9.SensorMultilevelSupportedSensorReport)
        }
        return mock
    }

    SilenceAlarmV1 createSilenceAlarmV1Mock()
    {
        def mock = Mock(SilenceAlarmV1)
        {
            _ * sensorAlarmSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.silencealarmv1.SensorAlarmSet)
        }
        return mock
    }

    SimpleAvControlV1 createSimpleAvControlV1Mock()
    {
        def mock = Mock(SimpleAvControlV1)
        {
            _ * simpleAvControlGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlGet)
            _ * simpleAvControlReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlReport)
            _ * simpleAvControlSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlSet)
            _ * simpleAvControlSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlSupportedGet)
            _ * simpleAvControlSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.simpleavcontrolv1.SimpleAvControlSupportedReport)
        }
        return mock
    }

    SoundSwitchV1 createSoundSwitchV1Mock()
    {
        def mock = Mock(SoundSwitchV1)
        {
            _ * configurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ConfigurationGet)
            _ * configurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ConfigurationReport)
            _ * configurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ConfigurationSet)
            _ * toneInfoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ToneInfoGet)
            _ * toneInfoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.ToneInfoReport)
            _ * tonePlayGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonePlayGet)
            _ * tonePlayReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonePlayReport)
            _ * tonePlaySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonePlaySet)
            _ * tonesNumberGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonesNumberGet)
            _ * tonesNumberReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv1.TonesNumberReport)
        }
        return mock
    }

    SoundSwitchV2 createSoundSwitchV2Mock()
    {
        def mock = Mock(SoundSwitchV2)
        {
            _ * configurationGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ConfigurationGet)
            _ * configurationReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ConfigurationReport)
            _ * configurationSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ConfigurationSet)
            _ * toneInfoGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ToneInfoGet)
            _ * toneInfoReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.ToneInfoReport)
            _ * tonePlayGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonePlayGet)
            _ * tonePlayReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonePlayReport)
            _ * tonePlaySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonePlaySet)
            _ * tonesNumberGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonesNumberGet)
            _ * tonesNumberReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.soundswitchv2.TonesNumberReport)
        }
        return mock
    }

    SupervisionV1 createSupervisionV1Mock()
    {
        def supervisionGetMock = Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv1.SupervisionGet)
        {
            _ * encapsulate(_ as Command) >> { cmd -> return Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv1.SupervisionGet) }
        }
        def mock = Mock(SupervisionV1)
        {
            _ * supervisionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv1.SupervisionGet)
            _ * supervisionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv1.SupervisionReport)
        }
        return mock
    }

    SupervisionV2 createSupervisionV2Mock()
    {
        def supervisionGetMock = Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv2.SupervisionGet)
        {
            _ * encapsulate(_ as Command) >> { cmd -> return Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv2.SupervisionGet) }
        }
        def mock = Mock(SupervisionV2)
        {
            _ * supervisionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv2.SupervisionGet)
            _ * supervisionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.supervisionv2.SupervisionReport)
        }
        return mock
    }

    SwitchAllV1 createSwitchAllV1Mock()
    {
        def mock = Mock(SwitchAllV1)
        {
            _ * switchAllGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllGet)
            _ * switchAllOff(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllOff)
            _ * switchAllOn(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllOn)
            _ * switchAllReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllReport)
            _ * switchAllSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchallv1.SwitchAllSet)
        }
        return mock
    }

    SwitchBinaryV1 createSwitchBinaryV1Mock()
    {
        def mock = Mock(SwitchBinaryV1)
        {
            _ * switchBinaryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv1.SwitchBinaryGet)
            _ * switchBinaryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv1.SwitchBinaryReport)
            _ * switchBinarySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv1.SwitchBinarySet)
        }
        return mock
    }

    SwitchBinaryV2 createSwitchBinaryV2Mock()
    {
        def mock = Mock(SwitchBinaryV2)
        {
            _ * switchBinaryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv2.SwitchBinaryGet)
            _ * switchBinaryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv2.SwitchBinaryReport)
            _ * switchBinarySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchbinaryv2.SwitchBinarySet)
        }
        return mock
    }

    SwitchColorV1 createSwitchColorV1Mock()
    {
        def mock = Mock(SwitchColorV1)
        {
            _ * switchColorGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1.SwitchColorGet)
            _ * switchColorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1.SwitchColorReport)
            _ * switchColorSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1.SwitchColorSet)
            _ * switchColorStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1.SwitchColorStartLevelChange)
            _ * switchColorStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1.SwitchColorStopLevelChange)
            _ * switchColorSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1.SwitchColorSupportedGet)
            _ * switchColorSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv1.SwitchColorSupportedReport)
        }
        return mock
    }

    SwitchColorV2 createSwitchColorV2Mock()
    {
        def mock = Mock(SwitchColorV2)
        {
            _ * switchColorGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorGet)
            _ * switchColorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorReport)
            _ * switchColorSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorSet)
            _ * switchColorStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorStartLevelChange)
            _ * switchColorStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorStopLevelChange)
            _ * switchColorSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorSupportedGet)
            _ * switchColorSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv2.SwitchColorSupportedReport)
        }
        return mock
    }

    SwitchColorV3 createSwitchColorV3Mock()
    {
        def mock = Mock(SwitchColorV3)
        {
            _ * switchColorGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorGet)
            _ * switchColorReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorReport)
            _ * switchColorSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorSet)
            _ * switchColorStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorStartLevelChange)
            _ * switchColorStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorStopLevelChange)
            _ * switchColorSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorSupportedGet)
            _ * switchColorSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchcolorv3.SwitchColorSupportedReport)
        }
        return mock
    }

    SwitchMultilevelV1 createSwitchMultilevelV1Mock()
    {
        def mock = Mock(SwitchMultilevelV1)
        {
            _ * switchMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv1.SwitchMultilevelGet)
            _ * switchMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv1.SwitchMultilevelReport)
            _ * switchMultilevelSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv1.SwitchMultilevelSet)
            _ * switchMultilevelStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv1.SwitchMultilevelStartLevelChange)
            _ * switchMultilevelStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv1.SwitchMultilevelStopLevelChange)
        }
        return mock
    }

    SwitchMultilevelV2 createSwitchMultilevelV2Mock()
    {
        def mock = Mock(SwitchMultilevelV2)
        {
            _ * switchMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelGet)
            _ * switchMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelReport)
            _ * switchMultilevelSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelSet)
            _ * switchMultilevelStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelStartLevelChange)
            _ * switchMultilevelStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv2.SwitchMultilevelStopLevelChange)
        }
        return mock
    }

    SwitchMultilevelV3 createSwitchMultilevelV3Mock()
    {
        def mock = Mock(SwitchMultilevelV3)
        {
            _ * switchMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelGet)
            _ * switchMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelReport)
            _ * switchMultilevelSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelSet)
            _ * switchMultilevelStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelStartLevelChange)
            _ * switchMultilevelStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelStopLevelChange)
            _ * switchMultilevelSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelSupportedGet)
            _ * switchMultilevelSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv3.SwitchMultilevelSupportedReport)
        }
        return mock
    }

    SwitchMultilevelV4 createSwitchMultilevelV4Mock()
    {
        def mock = Mock(SwitchMultilevelV4)
        {
            _ * switchMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4.SwitchMultilevelGet)
            _ * switchMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4.SwitchMultilevelReport)
            _ * switchMultilevelSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4.SwitchMultilevelSet)
            _ * switchMultilevelStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4.SwitchMultilevelStartLevelChange)
            _ * switchMultilevelStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4.SwitchMultilevelStopLevelChange)
            _ * switchMultilevelSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4.SwitchMultilevelSupportedGet)
            _ * switchMultilevelSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchmultilevelv4.SwitchMultilevelSupportedReport)
        }
        return mock
    }

    SwitchToggleBinaryV1 createSwitchToggleBinaryV1Mock()
    {
        def mock = Mock(SwitchToggleBinaryV1)
        {
            _ * switchToggleBinaryGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglebinaryv1.SwitchToggleBinaryGet)
            _ * switchToggleBinaryReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglebinaryv1.SwitchToggleBinaryReport)
            _ * switchToggleBinarySet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglebinaryv1.SwitchToggleBinarySet)
        }
        return mock
    }

    SwitchToggleMultilevelV1 createSwitchToggleMultilevelV1Mock()
    {
        def mock = Mock(SwitchToggleMultilevelV1)
        {
            _ * switchToggleMultilevelGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelGet)
            _ * switchToggleMultilevelReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelReport)
            _ * switchToggleMultilevelSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelSet)
            _ * switchToggleMultilevelStartLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelStartLevelChange)
            _ * switchToggleMultilevelStopLevelChange(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.switchtogglemultilevelv1.SwitchToggleMultilevelStopLevelChange)
        }
        return mock
    }

    TariffConfigV1 createTariffConfigV1Mock()
    {
        def mock = Mock(TariffConfigV1)
        {
            _ * tariffTblRemove(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1.TariffTblRemove)
            _ * tariffTblSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1.TariffTblSet)
            _ * tariffTblSupplierSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tariffconfigv1.TariffTblSupplierSet)
        }
        return mock
    }

    TariffTblMonitorV1 createTariffTblMonitorV1Mock()
    {
        def mock = Mock(TariffTblMonitorV1)
        {
            _ * tariffTblCostGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblCostGet)
            _ * tariffTblCostReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblCostReport)
            _ * tariffTblGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblGet)
            _ * tariffTblReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblReport)
            _ * tariffTblSupplierGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblSupplierGet)
            _ * tariffTblSupplierReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.tarifftblmonitorv1.TariffTblSupplierReport)
        }
        return mock
    }

    ThermostatFanModeV1 createThermostatFanModeV1Mock()
    {
        def mock = Mock(ThermostatFanModeV1)
        {
            _ * thermostatFanModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev1.ThermostatFanModeGet)
            _ * thermostatFanModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev1.ThermostatFanModeReport)
            _ * thermostatFanModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev1.ThermostatFanModeSet)
            _ * thermostatFanModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev1.ThermostatFanModeSupportedGet)
            _ * thermostatFanModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev1.ThermostatFanModeSupportedReport)
        }
        return mock
    }

    ThermostatFanModeV2 createThermostatFanModeV2Mock()
    {
        def mock = Mock(ThermostatFanModeV2)
        {
            _ * thermostatFanModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev2.ThermostatFanModeGet)
            _ * thermostatFanModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev2.ThermostatFanModeReport)
            _ * thermostatFanModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev2.ThermostatFanModeSet)
            _ * thermostatFanModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev2.ThermostatFanModeSupportedGet)
            _ * thermostatFanModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev2.ThermostatFanModeSupportedReport)
        }
        return mock
    }

    ThermostatFanModeV3 createThermostatFanModeV3Mock()
    {
        def mock = Mock(ThermostatFanModeV3)
        {
            _ * thermostatFanModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeGet)
            _ * thermostatFanModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeReport)
            _ * thermostatFanModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeSet)
            _ * thermostatFanModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeSupportedGet)
            _ * thermostatFanModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev3.ThermostatFanModeSupportedReport)
        }
        return mock
    }

    ThermostatFanModeV4 createThermostatFanModeV4Mock()
    {
        def mock = Mock(ThermostatFanModeV4)
        {
            _ * thermostatFanModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeGet)
            _ * thermostatFanModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeReport)
            _ * thermostatFanModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeSet)
            _ * thermostatFanModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeSupportedGet)
            _ * thermostatFanModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev4.ThermostatFanModeSupportedReport)
        }
        return mock
    }

    ThermostatFanModeV5 createThermostatFanModeV5Mock()
    {
        def mock = Mock(ThermostatFanModeV5)
        {
            _ * thermostatFanModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeGet)
            _ * thermostatFanModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeReport)
            _ * thermostatFanModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeSet)
            _ * thermostatFanModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeSupportedGet)
            _ * thermostatFanModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanmodev5.ThermostatFanModeSupportedReport)
        }
        return mock
    }

    ThermostatFanStateV1 createThermostatFanStateV1Mock()
    {
        def mock = Mock(ThermostatFanStateV1)
        {
            _ * thermostatFanStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanstatev1.ThermostatFanStateGet)
            _ * thermostatFanStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanstatev1.ThermostatFanStateReport)
        }
        return mock
    }

    ThermostatFanStateV2 createThermostatFanStateV2Mock()
    {
        def mock = Mock(ThermostatFanStateV2)
        {
            _ * thermostatFanStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanstatev2.ThermostatFanStateGet)
            _ * thermostatFanStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatfanstatev2.ThermostatFanStateReport)
        }
        return mock
    }

    ThermostatHeatingV1 createThermostatHeatingV1Mock()
    {
        def mock = Mock(ThermostatHeatingV1)
        {
            _ * thermostatHeatingModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingModeGet)
            _ * thermostatHeatingModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingModeReport)
            _ * thermostatHeatingModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingModeSet)
            _ * thermostatHeatingRelayStatusGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingRelayStatusGet)
            _ * thermostatHeatingRelayStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingRelayStatusReport)
            _ * thermostatHeatingSetpointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingSetpointGet)
            _ * thermostatHeatingSetpointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingSetpointReport)
            _ * thermostatHeatingSetpointSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingSetpointSet)
            _ * thermostatHeatingStatusGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingStatusGet)
            _ * thermostatHeatingStatusReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingStatusReport)
            _ * thermostatHeatingStatusSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingStatusSet)
            _ * thermostatHeatingTimedOffSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatheatingv1.ThermostatHeatingTimedOffSet)
        }
        return mock
    }

    ThermostatModeV1 createThermostatModeV1Mock()
    {
        def mock = Mock(ThermostatModeV1)
        {
            _ * thermostatModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeGet)
            _ * thermostatModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeReport)
            _ * thermostatModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeSet)
            _ * thermostatModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeSupportedGet)
            _ * thermostatModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev1.ThermostatModeSupportedReport)
        }
        return mock
    }

    ThermostatModeV2 createThermostatModeV2Mock()
    {
        def mock = Mock(ThermostatModeV2)
        {
            _ * thermostatModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev2.ThermostatModeGet)
            _ * thermostatModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev2.ThermostatModeReport)
            _ * thermostatModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev2.ThermostatModeSet)
            _ * thermostatModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev2.ThermostatModeSupportedGet)
            _ * thermostatModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev2.ThermostatModeSupportedReport)
        }
        return mock
    }

    ThermostatModeV3 createThermostatModeV3Mock()
    {
        def mock = Mock(ThermostatModeV3)
        {
            _ * thermostatModeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeGet)
            _ * thermostatModeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeReport)
            _ * thermostatModeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeSet)
            _ * thermostatModeSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeSupportedGet)
            _ * thermostatModeSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatmodev3.ThermostatModeSupportedReport)
        }
        return mock
    }

    ThermostatOperatingStateV1 createThermostatOperatingStateV1Mock()
    {
        def mock = Mock(ThermostatOperatingStateV1)
        {
            _ * thermostatOperatingStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev1.ThermostatOperatingStateGet)
            _ * thermostatOperatingStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev1.ThermostatOperatingStateReport)
        }
        return mock
    }

    ThermostatOperatingStateV2 createThermostatOperatingStateV2Mock()
    {
        def mock = Mock(ThermostatOperatingStateV2)
        {
            _ * thermostatOperatingLoggingSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev2.ThermostatOperatingLoggingSupportedReport)
            _ * thermostatOperatingStateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev2.ThermostatOperatingStateGet)
            _ * thermostatOperatingStateLoggingGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev2.ThermostatOperatingStateLoggingGet)
            _ * thermostatOperatingStateLoggingReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev2.ThermostatOperatingStateLoggingReport)
            _ * thermostatOperatingStateLoggingSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev2.ThermostatOperatingStateLoggingSupportedGet)
            _ * thermostatOperatingStateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatoperatingstatev2.ThermostatOperatingStateReport)
        }
        return mock
    }

    ThermostatSetbackV1 createThermostatSetbackV1Mock()
    {
        def mock = Mock(ThermostatSetbackV1)
        {
            _ * thermostatSetbackGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetbackv1.ThermostatSetbackGet)
            _ * thermostatSetbackReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetbackv1.ThermostatSetbackReport)
            _ * thermostatSetbackSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetbackv1.ThermostatSetbackSet)
        }
        return mock
    }

    ThermostatSetpointV1 createThermostatSetpointV1Mock()
    {
        def mock = Mock(ThermostatSetpointV1)
        {
            _ * thermostatSetpointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv1.ThermostatSetpointGet)
            _ * thermostatSetpointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv1.ThermostatSetpointReport)
            _ * thermostatSetpointSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv1.ThermostatSetpointSet)
            _ * thermostatSetpointSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv1.ThermostatSetpointSupportedGet)
            _ * thermostatSetpointSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv1.ThermostatSetpointSupportedReport)
        }
        return mock
    }

    ThermostatSetpointV2 createThermostatSetpointV2Mock()
    {
        def mock = Mock(ThermostatSetpointV2)
        {
            _ * thermostatSetpointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointGet)
            _ * thermostatSetpointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointReport)
            _ * thermostatSetpointSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointSet)
            _ * thermostatSetpointSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointSupportedGet)
            _ * thermostatSetpointSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv2.ThermostatSetpointSupportedReport)
        }
        return mock
    }

    ThermostatSetpointV3 createThermostatSetpointV3Mock()
    {
        def mock = Mock(ThermostatSetpointV3)
        {
            _ * thermostatSetpointCapabilitiesGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointCapabilitiesGet)
            _ * thermostatSetpointCapabilitiesReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointCapabilitiesReport)
            _ * thermostatSetpointGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointGet)
            _ * thermostatSetpointReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointReport)
            _ * thermostatSetpointSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointSet)
            _ * thermostatSetpointSupportedGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointSupportedGet)
            _ * thermostatSetpointSupportedReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.thermostatsetpointv3.ThermostatSetpointSupportedReport)
        }
        return mock
    }

    TimeParametersV1 createTimeParametersV1Mock()
    {
        def mock = Mock(TimeParametersV1)
        {
            _ * timeParametersGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timeparametersv1.TimeParametersGet)
            _ * timeParametersReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timeparametersv1.TimeParametersReport)
            _ * timeParametersSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timeparametersv1.TimeParametersSet)
        }
        return mock
    }

    TimeV1 createTimeV1Mock()
    {
        def mock = Mock(TimeV1)
        {
            _ * dateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1.DateGet)
            _ * dateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1.DateReport)
            _ * timeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1.TimeGet)
            _ * timeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev1.TimeReport)
        }
        return mock
    }

    TimeV2 createTimeV2Mock()
    {
        def mock = Mock(TimeV2)
        {
            _ * dateGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.DateGet)
            _ * dateReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.DateReport)
            _ * timeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeGet)
            _ * timeOffsetGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeOffsetGet)
            _ * timeOffsetReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeOffsetReport)
            _ * timeOffsetSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeOffsetSet)
            _ * timeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.timev2.TimeReport)
        }
        return mock
    }

    TransportServiceV1 createTransportServiceV1Mock()
    {
        def mock = Mock(TransportServiceV1)
        {
            _ * commandFirstFragment(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandFirstFragment)
            _ * commandFragmentComplete(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandFragmentComplete)
            _ * commandFragmentRequest(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandFragmentRequest)
            _ * commandFragmentWait(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandFragmentWait)
            _ * commandSubsequentFragment(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.transportservicev1.CommandSubsequentFragment)
        }
        return mock
    }

    UserCodeV1 createUserCodeV1Mock()
    {
        def mock = Mock(UserCodeV1)
        {
            _ * userCodeGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UserCodeGet)
            _ * userCodeReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UserCodeReport)
            _ * userCodeSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UserCodeSet)
            _ * usersNumberGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UsersNumberGet)
            _ * usersNumberReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.usercodev1.UsersNumberReport)
        }
        return mock
    }

    VersionV1 createVersionV1Mock()
    {
        def mock = Mock(VersionV1)
        {
            _ * versionCommandClassGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv1.VersionCommandClassGet)
            _ * versionCommandClassReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv1.VersionCommandClassReport)
            _ * versionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv1.VersionGet)
            _ * versionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv1.VersionReport)
        }
        return mock
    }

    VersionV2 createVersionV2Mock()
    {
        def mock = Mock(VersionV2)
        {
            _ * versionCommandClassGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv2.VersionCommandClassGet)
            _ * versionCommandClassReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv2.VersionCommandClassReport)
            _ * versionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv2.VersionGet)
            _ * versionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv2.VersionReport)
        }
        return mock
    }

    VersionV3 createVersionV3Mock()
    {
        def mock = Mock(VersionV3)
        {
            _ * versionCapabilitiesGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionCapabilitiesGet)
            _ * versionCapabilitiesReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionCapabilitiesReport)
            _ * versionCommandClassGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionCommandClassGet)
            _ * versionCommandClassReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionCommandClassReport)
            _ * versionGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionGet)
            _ * versionReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionReport)
            _ * versionZWaveSoftwareGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionZWaveSoftwareGet)
            _ * versionZWaveSoftwareReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.versionv3.VersionZWaveSoftwareReport)
        }
        return mock
    }

    WakeUpV1 createWakeUpV1Mock()
    {
        def mock = Mock(WakeUpV1)
        {
            _ * wakeUpIntervalGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpIntervalGet)
            _ * wakeUpIntervalReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpIntervalReport)
            _ * wakeUpIntervalSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpIntervalSet)
            _ * wakeUpNoMoreInformation(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpNoMoreInformation)
            _ * wakeUpNotification(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv1.WakeUpNotification)
        }
        return mock
    }

    WakeUpV2 createWakeUpV2Mock()
    {
        def mock = Mock(WakeUpV2)
        {
            _ * wakeUpIntervalCapabilitiesGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalCapabilitiesGet)
            _ * wakeUpIntervalCapabilitiesReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalCapabilitiesReport)
            _ * wakeUpIntervalGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalGet)
            _ * wakeUpIntervalReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalReport)
            _ * wakeUpIntervalSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpIntervalSet)
            _ * wakeUpNoMoreInformation(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpNoMoreInformation)
            _ * wakeUpNotification(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv2.WakeUpNotification)
        }
        return mock
    }

    WakeUpV3 createWakeUpV3Mock()
    {
        def mock = Mock(WakeUpV3)
        {
            _ * wakeUpIntervalCapabilitiesGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalCapabilitiesGet)
            _ * wakeUpIntervalCapabilitiesReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalCapabilitiesReport)
            _ * wakeUpIntervalGet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalGet)
            _ * wakeUpIntervalReport(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalReport)
            _ * wakeUpIntervalSet(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpIntervalSet)
            _ * wakeUpNoMoreInformation(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpNoMoreInformation)
            _ * wakeUpNotification(*_) >> Mock(me.biocomp.hubitat_ci.api.device_api.zwave.commands.wakeupv3.WakeUpNotification)
        }
        return mock
    }

    Zwave createZwaveMocks()
    {
        def mock =  Mock(Zwave)
        {
            _ * getAlarmV1() >> createAlarmV1Mock()
            _ * getAlarmV2() >> createAlarmV2Mock()
            _ * getAntitheftUnlockV1() >> createAntitheftUnlockV1Mock()
            _ * getAntitheftV1() >> createAntitheftV1Mock()
            _ * getAntitheftV2() >> createAntitheftV2Mock()
            _ * getAntitheftV3() >> createAntitheftV3Mock()
            _ * getApplicationCapabilityV1() >> createApplicationCapabilityV1Mock()
            _ * getApplicationStatusV1() >> createApplicationStatusV1Mock()
            _ * getAssociationCommandConfigurationV1() >> createAssociationCommandConfigurationV1Mock()
            _ * getAssociationGrpInfoV1() >> createAssociationGrpInfoV1Mock()
            _ * getAssociationGrpInfoV2() >> createAssociationGrpInfoV2Mock()
            _ * getAssociationGrpInfoV3() >> createAssociationGrpInfoV3Mock()
            _ * getAssociationV1() >> createAssociationV1Mock()
            _ * getAssociationV2() >> createAssociationV2Mock()
            _ * getAssociationV3() >> createAssociationV3Mock()
            _ * getAvContentDirectoryMdV1() >> createAvContentDirectoryMdV1Mock()
            _ * getAvContentSearchMdV1() >> createAvContentSearchMdV1Mock()
            _ * getAvRendererStatusV1() >> createAvRendererStatusV1Mock()
            _ * getAvTaggingMdV1() >> createAvTaggingMdV1Mock()
            _ * getBarrierOperatorV1() >> createBarrierOperatorV1Mock()
            _ * getBasicTariffInfoV1() >> createBasicTariffInfoV1Mock()
            _ * getBasicV1() >> createBasicV1Mock()
            _ * getBasicV2() >> createBasicV2Mock()
            _ * getBasicWindowCoveringV1() >> createBasicWindowCoveringV1Mock()
            _ * getBatteryV1() >> createBatteryV1Mock()
            _ * getBatteryV2() >> createBatteryV2Mock()
            _ * getBatteryV3() >> createBatteryV3Mock()
            _ * getCentralSceneV1() >> createCentralSceneV1Mock()
            _ * getCentralSceneV2() >> createCentralSceneV2Mock()
            _ * getCentralSceneV3() >> createCentralSceneV3Mock()
            _ * getChimneyFanV1() >> createChimneyFanV1Mock()
            _ * getClimateControlScheduleV1() >> createClimateControlScheduleV1Mock()
            _ * getClockV1() >> createClockV1Mock()
            _ * getConfigurationV1() >> createConfigurationV1Mock()
            _ * getConfigurationV2() >> createConfigurationV2Mock()
            _ * getControllerReplicationV1() >> createControllerReplicationV1Mock()
            _ * getCrc16EncapV1() >> createCrc16EncapV1Mock()
            _ * getDcpConfigV1() >> createDcpConfigV1Mock()
            _ * getDcpMonitorV1() >> createDcpMonitorV1Mock()
            _ * getDeviceResetLocallyV1() >> createDeviceResetLocallyV1Mock()
            _ * getDmxV1() >> createDmxV1Mock()
            _ * getDoorLockLoggingV1() >> createDoorLockLoggingV1Mock()
            _ * getDoorLockV1() >> createDoorLockV1Mock()
            _ * getEnergyProductionV1() >> createEnergyProductionV1Mock()
            _ * getEntryControlV1() >> createEntryControlV1Mock()
            _ * getFirmwareUpdateMdV1() >> createFirmwareUpdateMdV1Mock()
            _ * getFirmwareUpdateMdV2() >> createFirmwareUpdateMdV2Mock()
            _ * getFirmwareUpdateMdV3() >> createFirmwareUpdateMdV3Mock()
            _ * getFirmwareUpdateMdV4() >> createFirmwareUpdateMdV4Mock()
            _ * getFirmwareUpdateMdV5() >> createFirmwareUpdateMdV5Mock()
            _ * getFirmwareUpdateMdV6() >> createFirmwareUpdateMdV6Mock()
            _ * getGeographicLocationV1() >> createGeographicLocationV1Mock()
            _ * getGroupingNameV1() >> createGroupingNameV1Mock()
            _ * getHailV1() >> createHailV1Mock()
            _ * getHrvControlV1() >> createHrvControlV1Mock()
            _ * getHrvStatusV1() >> createHrvStatusV1Mock()
            _ * getHumidityControlModeV1() >> createHumidityControlModeV1Mock()
            _ * getHumidityControlModeV2() >> createHumidityControlModeV2Mock()
            _ * getHumidityControlOperatingStateV1() >> createHumidityControlOperatingStateV1Mock()
            _ * getHumidityControlSetpointV1() >> createHumidityControlSetpointV1Mock()
            _ * getHumidityControlSetpointV2() >> createHumidityControlSetpointV2Mock()
            _ * getIndicatorV1() >> createIndicatorV1Mock()
            _ * getIndicatorV2() >> createIndicatorV2Mock()
            _ * getIndicatorV3() >> createIndicatorV3Mock()
            _ * getIpConfigurationV1() >> createIpConfigurationV1Mock()
            _ * getIrrigationV1() >> createIrrigationV1Mock()
            _ * getLanguageV1() >> createLanguageV1Mock()
            _ * getLockV1() >> createLockV1Mock()
            _ * getManufacturerSpecificV1() >> createManufacturerSpecificV1Mock()
            _ * getManufacturerSpecificV2() >> createManufacturerSpecificV2Mock()
            _ * getMeterPulseV1() >> createMeterPulseV1Mock()
            _ * getMeterTblConfigV1() >> createMeterTblConfigV1Mock()
            _ * getMeterTblMonitorV1() >> createMeterTblMonitorV1Mock()
            _ * getMeterTblMonitorV2() >> createMeterTblMonitorV2Mock()
            _ * getMeterTblPushV1() >> createMeterTblPushV1Mock()
            _ * getMeterV1() >> createMeterV1Mock()
            _ * getMeterV2() >> createMeterV2Mock()
            _ * getMeterV3() >> createMeterV3Mock()
            _ * getMeterV4() >> createMeterV4Mock()
            _ * getMeterV5() >> createMeterV5Mock()
            _ * getMtpWindowCoveringV1() >> createMtpWindowCoveringV1Mock()
            _ * getMultiChannelAssociationV2() >> createMultiChannelAssociationV2Mock()
            _ * getMultiChannelAssociationV3() >> createMultiChannelAssociationV3Mock()
            _ * getMultiChannelAssociationV4() >> createMultiChannelAssociationV4Mock()
            _ * getMultiChannelV2() >> createMultiChannelV2Mock()
            _ * getMultiChannelV3() >> createMultiChannelV3Mock()
            _ * getMultiChannelV4() >> createMultiChannelV4Mock()
            _ * getMultiCmdV1() >> createMultiCmdV1Mock()
            _ * getMultiInstanceAssociationV1() >> createMultiInstanceAssociationV1Mock()
            _ * getMultiInstanceV1() >> createMultiInstanceV1Mock()
            _ * getNetworkManagementInstallationMaintenanceV1() >> createNetworkManagementInstallationMaintenanceV1Mock()
            _ * getNetworkManagementInstallationMaintenanceV2() >> createNetworkManagementInstallationMaintenanceV2Mock()
            _ * getNodeNamingV1() >> createNodeNamingV1Mock()
            _ * getNotificationV3() >> createNotificationV3Mock()
            _ * getNotificationV4() >> createNotificationV4Mock()
            _ * getNotificationV5() >> createNotificationV5Mock()
            _ * getNotificationV6() >> createNotificationV6Mock()
            _ * getNotificationV7() >> createNotificationV7Mock()
            _ * getNotificationV8() >> createNotificationV8Mock()
            _ * getPowerlevelV1() >> createPowerlevelV1Mock()
            _ * getPrepaymentEncapsulationV1() >> createPrepaymentEncapsulationV1Mock()
            _ * getPrepaymentV1() >> createPrepaymentV1Mock()
            _ * getProprietaryV1() >> createProprietaryV1Mock()
            _ * getProtectionV1() >> createProtectionV1Mock()
            _ * getProtectionV2() >> createProtectionV2Mock()
            _ * getRateTblConfigV1() >> createRateTblConfigV1Mock()
            _ * getRateTblMonitorV1() >> createRateTblMonitorV1Mock()
            _ * getRemoteAssociationActivateV1() >> createRemoteAssociationActivateV1Mock()
            _ * getRemoteAssociationV1() >> createRemoteAssociationV1Mock()
            _ * getSceneActivationV1() >> createSceneActivationV1Mock()
            _ * getSceneActuatorConfV1() >> createSceneActuatorConfV1Mock()
            _ * getSceneControllerConfV1() >> createSceneControllerConfV1Mock()
            _ * getScheduleEntryLockV1() >> createScheduleEntryLockV1Mock()
            _ * getScheduleEntryLockV2() >> createScheduleEntryLockV2Mock()
            _ * getScheduleEntryLockV3() >> createScheduleEntryLockV3Mock()
            _ * getScheduleV1() >> createScheduleV1Mock()
            _ * getScreenAttributesV1() >> createScreenAttributesV1Mock()
            _ * getScreenAttributesV2() >> createScreenAttributesV2Mock()
            _ * getScreenMdV1() >> createScreenMdV1Mock()
            _ * getScreenMdV2() >> createScreenMdV2Mock()
            _ * getSecurity2V1() >> createSecurity2V1Mock()
            _ * getSecurityPanelModeV1() >> createSecurityPanelModeV1Mock()
            _ * getSecurityPanelZoneSensorV1() >> createSecurityPanelZoneSensorV1Mock()
            _ * getSecurityPanelZoneV1() >> createSecurityPanelZoneV1Mock()
            _ * getSecurityV1() >> createSecurityV1Mock()
            _ * getSensorAlarmV1() >> createSensorAlarmV1Mock()
            _ * getSensorBinaryV1() >> createSensorBinaryV1Mock()
            _ * getSensorBinaryV2() >> createSensorBinaryV2Mock()
            _ * getSensorConfigurationV1() >> createSensorConfigurationV1Mock()
            _ * getSensorMultilevelV1() >> createSensorMultilevelV1Mock()
            _ * getSensorMultilevelV10() >> createSensorMultilevelV10Mock()
            _ * getSensorMultilevelV11() >> createSensorMultilevelV11Mock()
            _ * getSensorMultilevelV2() >> createSensorMultilevelV2Mock()
            _ * getSensorMultilevelV3() >> createSensorMultilevelV3Mock()
            _ * getSensorMultilevelV4() >> createSensorMultilevelV4Mock()
            _ * getSensorMultilevelV5() >> createSensorMultilevelV5Mock()
            _ * getSensorMultilevelV6() >> createSensorMultilevelV6Mock()
            _ * getSensorMultilevelV7() >> createSensorMultilevelV7Mock()
            _ * getSensorMultilevelV8() >> createSensorMultilevelV8Mock()
            _ * getSensorMultilevelV9() >> createSensorMultilevelV9Mock()
            _ * getSilenceAlarmV1() >> createSilenceAlarmV1Mock()
            _ * getSimpleAvControlV1() >> createSimpleAvControlV1Mock()
            _ * getSoundSwitchV1() >> createSoundSwitchV1Mock()
            _ * getSoundSwitchV2() >> createSoundSwitchV2Mock()
            _ * getSupervisionV1() >> createSupervisionV1Mock()
            _ * getSupervisionV2() >> createSupervisionV2Mock()
            _ * getSwitchAllV1() >> createSwitchAllV1Mock()
            _ * getSwitchBinaryV1() >> createSwitchBinaryV1Mock()
            _ * getSwitchBinaryV2() >> createSwitchBinaryV2Mock()
            _ * getSwitchColorV1() >> createSwitchColorV1Mock()
            _ * getSwitchColorV2() >> createSwitchColorV2Mock()
            _ * getSwitchColorV3() >> createSwitchColorV3Mock()
            _ * getSwitchMultilevelV1() >> createSwitchMultilevelV1Mock()
            _ * getSwitchMultilevelV2() >> createSwitchMultilevelV2Mock()
            _ * getSwitchMultilevelV3() >> createSwitchMultilevelV3Mock()
            _ * getSwitchMultilevelV4() >> createSwitchMultilevelV4Mock()
            _ * getSwitchToggleBinaryV1() >> createSwitchToggleBinaryV1Mock()
            _ * getSwitchToggleMultilevelV1() >> createSwitchToggleMultilevelV1Mock()
            _ * getTariffConfigV1() >> createTariffConfigV1Mock()
            _ * getTariffTblMonitorV1() >> createTariffTblMonitorV1Mock()
            _ * getThermostatFanModeV1() >> createThermostatFanModeV1Mock()
            _ * getThermostatFanModeV2() >> createThermostatFanModeV2Mock()
            _ * getThermostatFanModeV3() >> createThermostatFanModeV3Mock()
            _ * getThermostatFanModeV4() >> createThermostatFanModeV4Mock()
            _ * getThermostatFanModeV5() >> createThermostatFanModeV5Mock()
            _ * getThermostatFanStateV1() >> createThermostatFanStateV1Mock()
            _ * getThermostatFanStateV2() >> createThermostatFanStateV2Mock()
            _ * getThermostatHeatingV1() >> createThermostatHeatingV1Mock()
            _ * getThermostatModeV1() >> createThermostatModeV1Mock()
            _ * getThermostatModeV2() >> createThermostatModeV2Mock()
            _ * getThermostatModeV3() >> createThermostatModeV3Mock()
            _ * getThermostatOperatingStateV1() >> createThermostatOperatingStateV1Mock()
            _ * getThermostatOperatingStateV2() >> createThermostatOperatingStateV2Mock()
            _ * getThermostatSetbackV1() >> createThermostatSetbackV1Mock()
            _ * getThermostatSetpointV1() >> createThermostatSetpointV1Mock()
            _ * getThermostatSetpointV2() >> createThermostatSetpointV2Mock()
            _ * getThermostatSetpointV3() >> createThermostatSetpointV3Mock()
            _ * getTimeParametersV1() >> createTimeParametersV1Mock()
            _ * getTimeV1() >> createTimeV1Mock()
            _ * getTimeV2() >> createTimeV2Mock()
            _ * getTransportServiceV1() >> createTransportServiceV1Mock()
            _ * getUserCodeV1() >> createUserCodeV1Mock()
            _ * getVersionV1() >> createVersionV1Mock()
            _ * getVersionV2() >> createVersionV2Mock()
            _ * getVersionV3() >> createVersionV3Mock()
            _ * getWakeUpV1() >> createWakeUpV1Mock()
            _ * getWakeUpV2() >> createWakeUpV2Mock()
            _ * getWakeUpV3() >> createWakeUpV3Mock()
        }
        return mock
    }
}
