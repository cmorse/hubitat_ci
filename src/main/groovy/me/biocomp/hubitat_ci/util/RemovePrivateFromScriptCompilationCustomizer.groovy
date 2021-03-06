package me.biocomp.hubitat_ci.util

import groovy.transform.TypeChecked
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.classgen.GeneratorContext
import org.codehaus.groovy.control.CompilationFailedException
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.control.customizers.CompilationCustomizer

import org.objectweb.asm.Opcodes

/**
 * Removing 'private' allows overriding methods.
 * This allows user to mock any internal methods of the script under test.
 */
@TypeChecked
class RemovePrivateFromScriptCompilationCustomizer extends CompilationCustomizer{

    RemovePrivateFromScriptCompilationCustomizer() {
        super(CompilePhase.CANONICALIZATION);
    }

    @Override
    void call(SourceUnit source, GeneratorContext context, ClassNode classNode) throws CompilationFailedException {
        if (classNode.isScript())
        {
            classNode.methods.each{
                it.modifiers = (it.modifiers & ~Opcodes.ACC_PRIVATE) | Opcodes.ACC_PUBLIC
            }
        }
    }
}
