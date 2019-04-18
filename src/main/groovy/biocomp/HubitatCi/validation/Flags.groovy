package biocomp.hubitatCi.validation

import groovy.transform.TypeChecked

enum Flags
{
    // ## Common ##:
    Default,
    DontRunScript,
    AllowNullListOptions,
    /**
     * Allow required properties (such as page(title: "")) to be empty strings.
     * It's just a workaround to be able to support existing scripts.
     */
    AllowEmptyOptionValueStrings,

    // ## App ##:
    DontValidatePreferences,
    DontValidateDefinition,
    DontValidateMappings,
    DontValidateCapabilities,
    DontValidateAttributes,

    DontValidateDeviceInputName,
    AllowWritingToSettings,
    AllowReadingNonInputSettings,
    AllowUnreachablePages,
    AllowTitleInPageCallingMethods,
    AllowMissingOAuthPage,

    /**
     * Don't require install: true on at least one of the pages.
     * Note: this validation is added as people can't install such app.
     */
    AllowMissingInstall,


    // ## Driver ##:

    /**
     * Command must have a method in a script that can be called.
     * We validate this. This flag skips validation.
     */
    AllowCommandDefinitionWithNoArgsMatchAnyCommandWithSameName,

    /**
     * SmartThings documentation explicitly states that there is only a flat list of inputs in preferences().
     * However, there are hubitat scripts that have sections, and hubitat's driver does have 'section()'.
     * This allows section() inside preferences().
     */
    AllowSectionsInDevicePreferences,

    /**
     * When validating command() arguments, don't try to find corresponding real method in Script class.
     */
    AllowMissingCommandMethod,

    /**
     * We're considering 'name' and 'type' parameters being mandatory.
     * But there are scripts that don't set and don't use 'name'.
     * Parameter is just for information there. Still it's probably not a common case?
     * This flags doesn't require 'name' or 'type' being present.
     */
    AllowMissingDeviceInputNameOrType,

    /**
     * Do not require that capability's methods be implemented.
     */
    DontRequireCapabilityImplementationMethods

    /**
     * Generate EnumSet
     */
    @TypeChecked
    static EnumSet<Flags> from(Flags... settings)
    {
        return  EnumSet.copyOf(settings.toList());
    }
}