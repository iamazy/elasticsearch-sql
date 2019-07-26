package io.github.iamazy.elasticsearch.dsl.sql;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import java.util.BitSet;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public final class MethodWriter extends GeneratorAdapter {

    public MethodWriter(int access, Method method, ClassVisitor classVisitor, BitSet statements){
        super(Opcodes.ASM5,classVisitor.visitMethod(access,method.getName(),method.getDescriptor(),null,null),
                access,method.getName(),method.getDescriptor());
    }
}
