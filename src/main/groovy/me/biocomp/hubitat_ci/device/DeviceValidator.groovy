package me.biocomp.hubitat_ci.device

import me.biocomp.hubitat_ci.capabilities.Capabilities
import me.biocomp.hubitat_ci.device.metadata.*
import me.biocomp.hubitat_ci.util.RequreParseCompilationCusomizer
import me.biocomp.hubitat_ci.validation.Flags
import me.biocomp.hubitat_ci.validation.NamedParametersValidator
import me.biocomp.hubitat_ci.validation.ValidatorBase
import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode
import org.codehaus.groovy.control.customizers.CompilationCustomizer

import java.lang.reflect.Method

@TypeChecked
class DeviceValidator extends
        ValidatorBase
{
    //    private static final NamedParametersValidator preferencesValidatorWithOauth = NamedParametersValidator.make {
    //        stringParameter(name: "oauthPage", required: true)
    //    }
    //
    //    private static final NamedParametersValidator preferencesValidatorNoOauth = NamedParametersValidator.make {
    //    }
    //
    //    private static final NamedParametersValidator inputOptionsValidator = NamedParametersValidator.make {
    //        boolParameter(name: "capitalization")
    //        objParameter(name: "defaultValue")
    //        stringParameter(name: "name", required: true)
    //        stringParameter(name: "title")
    //        stringParameter(name: "description")
    //        boolParameter(name: "multiple")
    //        numericRangeParameter(name: "range")
    //        boolParameter(name: "required")
    //        boolParameter(name: "submitOnChange")
    //        listOfStringsParameter(name: "options")
    //        stringParameter(name: "type", required: true)
    //        boolParameter(name: "hideWhenEmpty")
    //    }
    //
    //    private static final HashSet<String> validStaticInputTypes = [
    //        "bool",
    //        //"bolean",
    //        "decimal",
    //        "email",
    //        "enum",
    //        "hub",
    //        "icon",
    //        "number",
    //        "password",
    //        "phone",
    //        "time",
    //        "text"
    //    ] as HashSet


    DeviceValidator(
            EnumSet<Flags> setOfFlags = EnumSet.noneOf(Flags), List<Class> extraAllowedClasses = [],
            List<String> extraAllowedExpressions = [])
    {
        super(setOfFlags, extraAllowedClasses, extraAllowedExpressions)
    }

    DeviceValidator(
            List<Flags> listOfFlags, List<Class> extraAllowedClasses = [], List<String> extraAllowedExpressions = [])
    {
        super(listOfFlags, extraAllowedClasses, extraAllowedExpressions)
    }

    HubitatDeviceScript parseScript(File scriptFile) {
        return constructParser(HubitatDeviceScript, makeCustomizers()).parse(scriptFile) as HubitatDeviceScript
    }

    HubitatDeviceScript parseScript(String scriptText) {
        return constructParser(HubitatDeviceScript, makeCustomizers()).parse(scriptText) as HubitatDeviceScript
    }

    /**
     * Add device-specific compilation cusomizers
     */
    private List<CompilationCustomizer> makeCustomizers()
    {
        if (!flags.contains(Flags.DontRequireParseMethodInDevice)) {
            return [new RequreParseCompilationCusomizer() as CompilationCustomizer]
        }
        else {
            return []
        }
    }


    //
    //    void validateAfterRun(AppDefinitionReader definitionReader, AppPreferencesReader preferencesReader, AppMappingsReader mappingsReader)
    //    {
    //        def preferences = preferencesReader.getProducedPreferences() // Just to trigger validation
    //        def definitions = definitionReader.getDefinitions() // Trigger definition validation
    //
    //        if (preferences && !hasFlag(Flags.DontValidatePreferences))
    //        {
    //            validatePreferences(preferences, false, definitions?.oauth as boolean)
    //        }
    //    }
    //
    //
    //    /**
    //     * Run validations after all pages and sections were added*/
    //    void validatePreferences(Preferences preferences, boolean okEmptyIfRegisteredDynamicPages, boolean oauthEnabled) {
    //        if (preferences.hasSpecialSinglePage()) {
    //            preferences.specialSinglePage.validate(this)
    //        }
    //
    //        if (!hasFlag(Flags.DontValidatePreferences)) {
    //            // Needs to have pages
    //            if (!okEmptyIfRegisteredDynamicPages || preferences.dynamicRegistrations.size() == 0) {
    //                assert (preferences.pages.size() != 0 || preferences.dynamicPages.size() != 0): "preferences() has to have pages (got ${preferences.pages.size()}), dynamic pages (got ${preferences.dynamicPages.size()})"
    //            }
    //
    //            // Page names must be unique
    //            def allNames = preferences.pages.collect { it.readName() } + preferences.dynamicPages.collect { it.readName() }
    //            def uniqueNames = [] as HashSet
    //            allNames.each {
    //                assert !uniqueNames.contains(
    //                        it): "Page '${it}' is not a unique page name. Page names must be unique. Please fix that. All page names: ${allNames}"
    //                uniqueNames << it
    //            }
    //
    //            // Multi-page app needs explicit 'install' (otherwise you won't be able to install this)
    //            if (!preferences.hasSpecialSinglePage() && !hasFlag(Flags.AllowMissingInstall)) {
    //                assert preferences.pages.findAll { it.options.install == true } + preferences.dynamicPages.findAll {
    //                    it.options.install == true
    //                }: "There is no 'install: true' option specified on any page (and it's not a special one-page app). This means you can't install the app. Please add the button to a page."
    //            }
    //
    //            // Pages must be reachable
    //            validatePagesAreReachable(preferences)
    //
    //            // Validate oauth page
    //            validateOauth(oauthEnabled, preferences, uniqueNames)
    //        }
    //    }
    //
    //    private void validateOauth(boolean oauthEnabled, Preferences preferences, HashSet<String> uniqueNames)
    //    {
    //        if (oauthEnabled && !preferences.hasSpecialSinglePage())
    //        {
    //            if (!hasFlag(Flags.AllowMissingOAuthPage)) {
    //                def oauthPageName = preferences.options.oauthPage as String
    //                preferencesValidatorWithOauth.validate("preferences()", preferences.options, this)
    //                assert uniqueNames.contains(oauthPageName): "preferences(): oauthPage = '${oauthPageName}' does not point to a valid page"
    //
    //                assert preferences.allPages[0].readName() == oauthPageName: "Page '${oauthPageName}' pointed by 'oauthPage' must be a first page, but first page is ${preferences.allPages[0]}"
    //                assert !preferences.allPages[0].isDynamicPage(): "Page '${oauthPageName}' pointed by 'oauthPage' must be static, not a dynamic page"
    //            }
    //        }
    //        else
    //        {
    //            preferencesValidatorNoOauth.validate("preferences()", preferences.options, this)
    //        }
    //    }
    //
    //
    //    private static Page getPageOrAssert(Page currentPage, String referredPage, HashMap<String, Page> allPages)
    //    {
    //        def foundPage = allPages[referredPage]
    //        assert foundPage: "${this}: Page's name '${referredPage}' referred by ${currentPage} is not valid. Valid page names are: ${allPages.keySet()}"
    //        return foundPage
    //    }
    //
    //    private static void addReachablePages(Page p, HashMap<String, Page> allPages, HashSet<String> reachablePages)
    //    {
    //        if (!reachablePages.contains(p.readName())) {
    //            reachablePages << p.readName()
    //
    //            p.sections.each {
    //                it.children.each {
    //                    if (it instanceof HRef) {
    //                        def referredPage = it.readPage()
    //                        if (referredPage) {
    //                            addReachablePages(getPageOrAssert(p, referredPage, allPages), allPages, reachablePages)
    //                        }
    //                    }
    //                }
    //            }
    //
    //            if (p.options?.nextPage) {
    //                addReachablePages(getPageOrAssert(p, p.options.nextPage as String, allPages), allPages, reachablePages)
    //            }
    //        }
    //    }
    //
    //    private void validatePagesAreReachable(Preferences preferences)
    //    {
    //        if (!hasFlag(Flags.AllowUnreachablePages)) {
    //            def reachablePages = [] as HashSet<String>
    //
    //            def pagesCombined = (preferences.pages + preferences.dynamicPages)
    //
    //            if (!pagesCombined.isEmpty()) {
    //                def allPages = [] as HashMap<String, Page>;
    //                (pagesCombined).each {
    //                    allPages[it.readName()] = it
    //                }
    //
    //
    //                addReachablePages(pagesCombined[0], allPages, reachablePages);
    //
    //                def unreachablePages = allPages.keySet() - reachablePages
    //                assert !unreachablePages: "${this}: pages ${unreachablePages} are not reachable via 'href' or 'nextPage', and thus don't make sense to have";
    //            }
    //        }
    //    }
    //
    //    void validateInput(Input input)
    //    {
    //        if (!hasFlag(Flags.DontValidatePreferences)) {
    //            inputOptionsValidator.validate(
    //                    input.toString(),
    //                    input.unnamedOptions,
    //                    input.options,
    //                    this)
    //
    //            validateInputType(input)
    //        }
    //    }
    //
    //    private void validateInputType(Input input)
    //    {
    //        final def inputType = input.readType()
    //        if (validStaticInputTypes.contains(inputType))
    //        {
    //            return
    //        }
    //
    //        if (inputType =~ /capability\.[a-zA-Z0-9._]+/)
    //        {
    //            if (Capabilities.capabilitiesByDeviceSelector.containsKey(inputType.substring(11)))
    //            {
    //                return
    //            }
    //            else
    //            {
    //                assert false : "Input ${input}'s capability '${inputType}' is not supported. Supported capabilities: ${Capabilities.capabilitiesByDeviceSelector.keySet()}"
    //            }
    //        }
    //
    //        if (inputType =~ /device\.[a-zA-Z0-9._]+/)
    //        {
    //            return
    //        }
    //
    //        assert false : "Input ${input}'s type ${inputType} is not supported. Valid types are: ${validStaticInputTypes} + 'device.yourDeviceName'"
    //    }
    //
    //    void validateSingleDynamicPageFor(Preferences preferences, String methodName) {
    //        if (!hasFlag(Flags.DontValidatePreferences)) {
    //            def set = [] as Set<String>;
    //            preferences.dynamicPages.each {
    //                assert it.generationMethodName: "Page ${it.readName()} was not produed by a separate method. This is not supported."
    //                assert !set.contains(
    //                        it.generationMethodName): "Method ${methodName} contains more than one dynamicPage() invocation: ${preferences.dynamicPages.findAll { it.generationMethodName == methodName }.collect { it.readName() }}"
    //                set << it.generationMethodName
    //            }
    //        }
    //    }

    private static final NamedParametersValidator definitionOptionsValidator = NamedParametersValidator.make {
        stringParameter("name", required(), mustNotBeEmpty())
        stringParameter("namespace", required(), mustNotBeEmpty())
        stringParameter("author", required(), mustNotBeEmpty())

        // Undocumented, but mentioned here:
        // https://community.hubitat.com/t/import-code-from-website-driver-code/10069/4
        stringParameter("importUrl", notRequired(), mustNotBeEmpty())
    }

    private static String printMethod(Method m)
    {
        def params = m.parameters.collect{
            "${it.type.simpleName} ${it.name}"
        }.join(", ")

        return "${m.name}(${params})"
    }

    void validateDefinition(Definition definition, MetaClass scriptMetaClass) {
        definitionOptionsValidator.validate("definition(${definition.options})", definition.options, flags)

        if (!hasFlag(Flags.DontRequireCapabilityImplementationMethods)) {
            def scriptActualMethods = scriptMetaClass.theClass.methods.findAll {
                it.declaringClass == scriptMetaClass.theClass
            }.collectEntries {
                [it.name, it]
            }

            definition.capabilities.each {
                def capabilityClass = Capabilities.findCapabilityByName(it)

                def missingMethods = capabilityClass.methods.findAll {
                    if (it.declaringClass == capabilityClass) {
                        //println "### Expecting method ${it.name}. Map ${scriptActualMethods.containsKey(it.name) ? "has it" : "doesn't have it" }"

                        return !scriptActualMethods.containsKey(it.name)
                    }
                }.collect { printMethod(it) }

                assert !missingMethods, "capability '${capabilityClass.simpleName}' method ${missingMethods} not implemented"
            }
        }
    }

    void validateCapability(String capabilityName) {
        assert (Capabilities.findCapabilityByName(
                capabilityName)): "capability '${capabilityName}' is not supported. Valid capabilities are: ${Capabilities.capabilitiesByPrettyName.keySet() + Capabilities.capabilitiesByDriverDefinition.keySet()}."
    }

    void validateAttribute(Attribute attribute) {
        assert attribute.name: "Attribute ${attribute} doesn't have a name."
        assert attribute.type: "Attribute ${attribute} doesn't have a type."

        assert attribute.type == 'string' || attribute.type == 'enum' || attribute.type == 'number': "Attribute ${attribute}'s type '${attribute.type}' is not supported."
        if (attribute.type == 'enum') {
            assert attribute.possibleValues != null && attribute.possibleValues.size() != 0: "Attribute ${attribute} with 'enum' type must have possible values specified."
        } else {
            assert attribute.possibleValues == null: "Attribute ${attribute} is not of type 'enum', it can't have possible values specified."
        }
    }

    static private <T> List<T> findDuplicates(List<T> inCollection) {
        Set<T> existing = []
        List<T> duplicates = []
        inCollection.each {
            if (existing.contains(it)) {
                duplicates.add(it)
            } else {
                existing.add(it)
            }
        }

        return duplicates
    }

    @TypeChecked(TypeCheckingMode.SKIP)
    void validateAfterRun(DeviceMetadataReader deviceMetadataReader) {
        if (hasFlag(Flags.DontValidateMetadata)) {
            return
        }

        assert deviceMetadataReader.hasMetadataCall: "Device does not have 'metadata' call"

        if (hasFlag(Flags.DontValidateDefinition)) {
            return
        }

        assert deviceMetadataReader.producedDefinition != null: "Device must have definition()"

        if (!hasFlag(Flags.DontValidateAttributes)) {
            def duplicateAttributes = findDuplicates(
                    deviceMetadataReader.producedDefinition.attributes.collect { it.name })
            assert duplicateAttributes.size() == 0: "Attributes ${duplicateAttributes} are duplicate, this is not useful."
        }

        if (!hasFlag(Flags.DontValidateCapabilities)) {
            assert deviceMetadataReader.producedDefinition.capabilities.size() != 0: "Device must have at least one capability"

            def duplicateCapabilities = findDuplicates(deviceMetadataReader.producedDefinition.capabilities.collect {
                Capabilities.findCapabilityByName(it)
            })

            assert duplicateCapabilities.size() == 0: "Capabilities ${duplicateCapabilities} are duplicate, this is not useful."
        }

        //{
        def duplicateCommands = findDuplicates(deviceMetadataReader.producedDefinition.commands.collect { it.toString() })
        assert duplicateCommands.size() == 0 : "Commands ${duplicateCommands} are duplicate, this is not useful."
    }

    private static final HashMap<String, Class> supportedCommandArgumentTypes = ['number': Integer, 'string': String] as HashMap

    private static Class parameterTypeToClass(Command command, String typeName) {
        assert supportedCommandArgumentTypes.containsKey(typeName) : "${command}: Argument type '${typeName}' is not supported. Supported types are: ${supportedCommandArgumentTypes}"
        return supportedCommandArgumentTypes.get(typeName)
    }

    @CompileStatic
    MetaMethod findMethodForCommand(MetaClass scriptMetaClass, String name, List<String> parameterTypes)
    {
        def command = new Command(name, parameterTypes, null)

        MetaMethod pickedMethod = scriptMetaClass.pickMethod(name,
                parameterTypes.collect { parameterTypeToClass(command, it) } as Class[])

        // MetaClass.pickMethod will ignore 1-argument parameterTypes, if method takes 0 arguments, so add extra validation.
        if (pickedMethod != null && pickedMethod.parameterTypes.size() != parameterTypes.size() && !hasFlag(Flags.AllowCommandDefinitionWithNoArgsMatchAnyCommandWithSameName)) {
            return null
        }
//
//        if (pickedMethod == null && parameterTypes.size() == 0 && ) {
//            pickedMethod = scriptMetaClass.metaMethods.find{ it.name == name }
//        }

        return pickedMethod
    }

    void validateCommand(Command command) {
        if (!hasFlag(Flags.AllowMissingCommandMethod)) {
            assert command.method != null: "Command ${command} does not have a method with matching signature in current script."
        }
    }

    private static final NamedParametersValidator fingerprintOptionsValidator = NamedParametersValidator.make {
        stringParameter("type", notRequired(), canBeEmpty())
        stringParameter("mfr", notRequired(), canBeEmpty())
        stringParameter("prod", notRequired(), canBeEmpty())
        stringParameter("model", notRequired(), canBeEmpty())
        stringParameter("cc", notRequired(), canBeEmpty())
        stringParameter("ccOut", notRequired(), canBeEmpty())
        stringParameter("sec", notRequired(), canBeEmpty())
        stringParameter("secOut", notRequired(), canBeEmpty())
        stringParameter("ff", notRequired(), canBeEmpty())
        stringParameter("ui", notRequired(), canBeEmpty())
        stringParameter("deviceJoinName", notRequired(), canBeEmpty())
        stringParameter("profileId", notRequired(), canBeEmpty())
        stringParameter("inClusters", notRequired(), canBeEmpty())
        stringParameter("outClusters", notRequired(), canBeEmpty())
        stringParameter("manufacturer", notRequired(), canBeEmpty())
        stringParameter("deviceId", notRequired(), canBeEmpty())
    }

    void validateFingerprint(Map fingerprint)
    {
        fingerprintOptionsValidator.validate("fingerprint(${fingerprint})", fingerprint, flags)
    }

    private static final NamedParametersValidator inputOptionsValidator = NamedParametersValidator.make {
        stringParameter("name", required(), canBeEmpty(), [Flags.DontValidateDeviceInputName])
        enumStringParameter("type", required(), [
            'bool',
            'decimal',
            'email',
            'enum',
            'number',
            'password',
            'phone',
            'time',
            'text',
            'paragraph' // TODO: verify if it's really supported
        ])
        stringParameter("title", notRequired(), canBeEmpty())
        stringParameter("description", notRequired(), canBeEmpty())
        objParameter("defaultValue", notRequired(), canBeNull())
        boolParameter("required", notRequired())
        boolParameter("displayDuringSetup", notRequired())
        numericRangeParameter("range", notRequired())
        listOfStringsParameter("options", notRequired())
    }

    void validateInput(DeviceInput input)
    {
        inputOptionsValidator.validate(
                input as String,
                input.unnamedOptions,
                input.options,
                flags,
                hasFlag(Flags.AllowMissingDeviceInputNameOrType)
                    ? EnumSet.of(NamedParametersValidator.ValidatorOption.IgnoreMissingMandatoryInputs)
                    : EnumSet.noneOf(NamedParametersValidator.ValidatorOption))
    }

    void validateSection(String name)
    {
        if (!hasFlag(Flags.AllowSectionsInDevicePreferences)) {
            assert false, "section('${name}') was used in preferences(), and while the method exists, it's not documented anywhere. Add Flags.AllowSectionsInDevicePreferences to allow sections."
        }
    }
}
