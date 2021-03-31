package me.biocomp.hubitat_ci.api.device_api.zwave.commands.sensormultilevelv10

import me.biocomp.hubitat_ci.api.device_api.zwave.Command

trait SensorMultilevelReport implements Command
{
    Short precision
    Short scale
    BigDecimal scaledSensorValue
    Short sensorType
    List sensorValue
    Short size
    static Short SENSOR_TYPE_ACCELERATION_X_AXIS_V8 = 52
    static Short SENSOR_TYPE_ACCELERATION_Y_AXIS_V8 = 53
    static Short SENSOR_TYPE_ACCELERATION_Z_AXIS_V8 = 54
    static Short SENSOR_TYPE_AIR_FLOW_VERSION_3 = 18
    static Short SENSOR_TYPE_ANGLE_POSITION_VERSION_4 = 21
    static Short SENSOR_TYPE_ATMOSPHERIC_PRESSURE_VERSION_2 = 8
    static Short SENSOR_TYPE_BAROMETRIC_PRESSURE_VERSION_2 = 9
    static Short SENSOR_TYPE_BASIC_METABOLIC_RATE_BMR_V7 = 50
    static Short SENSOR_TYPE_BLOOD_PRESSURE_V7 = 45
    static Short SENSOR_TYPE_BODY_MASS_INDEX_BMI_V7 = 51
    static Short SENSOR_TYPE_BONE_MASS_V7 = 48
    static Short SENSOR_TYPE_CARBON_MONOXIDE_CO_LEVEL_V7 = 40
    static Short SENSOR_TYPE_CO2_LEVEL_VERSION_3 = 17
    static Short SENSOR_TYPE_CURRENT_VERSION_3 = 16
    static Short SENSOR_TYPE_DEW_POINT_VERSION_2 = 11
    static Short SENSOR_TYPE_DIRECTION_VERSION_2 = 7
    static Short SENSOR_TYPE_DISTANCE_VERSION_3 = 20
    static Short SENSOR_TYPE_ELECTRICAL_CONDUCTIVITY_V5 = 29
    static Short SENSOR_TYPE_ELECTRICAL_RESISTIVITY_V5 = 28
    static Short SENSOR_TYPE_FAT_MASS_V7 = 47
    static Short SENSOR_TYPE_FORMALDEHYDE_CH2O_LEVEL_V7 = 36
    static Short SENSOR_TYPE_GENERAL_PURPOSE_VALUE_VERSION_1 = 2
    static Short SENSOR_TYPE_HEART_RATE_V7 = 44
    static Short SENSOR_TYPE_LOUDNESS_V5 = 30
    static Short SENSOR_TYPE_LUMINANCE_VERSION_1 = 3
    static Short SENSOR_TYPE_METHANE_DENSITY_V7 = 38
    static Short SENSOR_TYPE_MOISTURE_V5 = 31
    static Short SENSOR_TYPE_MUSCLE_MASS_V7 = 46
    static Short SENSOR_TYPE_PARTICULATE_MATTER_V10 = 59
    static Short SENSOR_TYPE_PARTICULATE_MATTER_V7 = 35
    static Short SENSOR_TYPE_POWER_VERSION_2 = 4
    static Short SENSOR_TYPE_RADON_CONCENTRATION_V7 = 37
    static Short SENSOR_TYPE_RAIN_RATE_VERSION_2 = 12
    static Short SENSOR_TYPE_RELATIVE_HUMIDITY_VERSION_2 = 5
    static Short SENSOR_TYPE_REPORT_FREQUENCY_V6 = 32
    static Short SENSOR_TYPE_RESPIRATORY_RATE_V10 = 60
    static Short SENSOR_TYPE_RF_SIGNAL_STRENGTH_V9 = 58
    static Short SENSOR_TYPE_ROTATION_V5 = 22
    static Short SENSOR_TYPE_SEISMIC_INTENSITY_V5 = 25
    static Short SENSOR_TYPE_SEISMIC_MAGNITUDE_V5 = 26
    static Short SENSOR_TYPE_SMOKE_DENSITY_V8 = 55
    static Short SENSOR_TYPE_SOIL_HUMIDITY_V7 = 41
    static Short SENSOR_TYPE_SOIL_REACTIVITY_V7 = 42
    static Short SENSOR_TYPE_SOIL_SALINITY_V7 = 43
    static Short SENSOR_TYPE_SOIL_TEMPERATURE_V5 = 24
    static Short SENSOR_TYPE_SOLAR_RADIATION_VERSION_2 = 10
    static Short SENSOR_TYPE_TANK_CAPACITY_VERSION_3 = 19
    static Short SENSOR_TYPE_TARGET_TEMPERATURE_V6 = 34
    static Short SENSOR_TYPE_TEMPERATURE_VERSION_1 = 1
    static Short SENSOR_TYPE_TIDE_LEVEL_VERSION_2 = 13
    static Short SENSOR_TYPE_TOTAL_BODY_WATER_TBW_V7 = 49
    static Short SENSOR_TYPE_ULTRAVIOLET_V5 = 27
    static Short SENSOR_TYPE_VELOCITY_VERSION_2 = 6
    static Short SENSOR_TYPE_VOLATILE_ORGANIC_COMPOUND_V7 = 39
    static Short SENSOR_TYPE_VOLTAGE_VERSION_3 = 15
    static Short SENSOR_TYPE_WATER_FLOW_V9 = 56
    static Short SENSOR_TYPE_WATER_PRESSURE_V9 = 57
    static Short SENSOR_TYPE_WATER_TEMPERATURE_V5 = 23
    static Short SENSOR_TYPE_WEIGHT_VERSION_3 = 14
    static Short SENSOR_TYPE__TIME_V6 = 33
}