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
        return Dog.class.getSuperclass().getSimpleName();
    }

    public void getImplementsInterfaces() {
        Type[] types = pClass.getGenericInterfaces();
        for (Type type : types) {
            System.out.println("  " + type.getTypeName());
        }
    }

    public void getPublicClassFields() {
        Field[] fields = pClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("  " + field.getName());
        }
    }

    public Constructor[] getPublicConstructor() {
        return pClass.getConstructors();
    }

    public void getPublicClassMethod() {
        Method[] methods = pClass.getMethods();
        for (Method method : methods) {
            System.out.println("  " + method.getName());
        }
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
        classInfo.getImplementsInterfaces();
        System.out.println("*****getPublicClassFields()*****");
        classInfo.getPublicClassFields();
        System.out.println("*****getPublicConstructor()*****");
        Arrays.stream(classInfo.getPublicConstructor())
                .forEach(System.out::println);
        System.out.println("*****getPublicClassMethod()*****");
        classInfo.getPublicClassMethod();
        System.out.println("*****getClassAnnotation()*****");
        Arrays.stream(classInfo.getClassAnnotation())
                .forEach(System.out::println);
    }
}
