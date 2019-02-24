package com.training;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class ClassInfo<P> {

    private Class<?> pClass;

    public ClassInfo(P p) {
        pClass = p.getClass();
    }

    public String getPackageName() {
        return pClass.getPackage().getName();
    }

    public String getClassModifier() {
        return Modifier.toString(pClass.getModifiers());
    }

    public String getSuperClass() {
        return Dog.class.getSuperclass().getName();
    }

    public Type[] getImplementsInterfaces() {
        return pClass.getGenericInterfaces();
    }

    public Field[] getPublicClassFields() {
        return pClass.getFields();
    }

    public Constructor[] getPublicConstructor() {
        return pClass.getConstructors();
    }

    public Method[] getPublicClassMethod() {
        return pClass.getMethods();
    }

    public Annotation[] getClassAnnotation() {
        return pClass.getAnnotations();
    }

    public static void main(String[] args) {
        ClassInfo<Dog> classInfo = new ClassInfo<>(new Dog());

        System.out.println("******getPackageName()******");
        System.out.println(classInfo.getPackageName());
        System.out.println("*****getClassModifier()*****");
        System.out.println(classInfo.getClassModifier());
        System.out.println("*****getSuperClass()*****");
        System.out.println(classInfo.getSuperClass());
        System.out.println("*****getImplementsInterfaces()*****");
        Arrays.stream(classInfo.getImplementsInterfaces())
                .forEach(System.out::println);
        System.out.println("*****getPublicClassFields()*****");
        Arrays.stream(classInfo.getPublicClassFields())
                .forEach(System.out::println);
        System.out.println("*****getPublicConstructor()*****");
        Arrays.stream(classInfo.getPublicConstructor())
                .forEach(System.out::println);
        System.out.println("*****getPublicClassMethod()*****");
        Arrays.stream(classInfo.getPublicClassMethod())
                .forEach(System.out::println);
        System.out.println("*****getClassAnnotation()*****");
        Arrays.stream(classInfo.getClassAnnotation())
                .forEach(System.out::println);
    }
}
