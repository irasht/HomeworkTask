package com.training;

import java.lang.reflect.*;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Lewko", "Chinook");

        Class<?> dogClass = dog.getClass();

        Field[] fields = dogClass.getFields();

        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isAnnotationPresent(NameAnnotation.class)) {
                System.out.println(fields[i].getName());
                NameAnnotation nameAnnotation = fields[i].getAnnotation(NameAnnotation.class);
                System.out.println(nameAnnotation.name());
            }
        }

        Method method = null;
        try {
            method = dogClass.getDeclaredMethod("methodOne", String.class);
            System.out.println(method.invoke(dog, dog.getName()));

            method = dogClass.getDeclaredMethod("methodTwo", int.class);
            System.out.println(method.invoke(dog, 5));

            method = dogClass.getDeclaredMethod("methodThree", double.class);
            System.out.println(method.invoke(dog, 5.8));

            method = dogClass.getDeclaredMethod("myMethod", String.class, int[].class);
            System.out.println(method.invoke(dog, dog.getBreed(), new int[]{5, 7}));

            method = dogClass.getDeclaredMethod("myMethodOne", String[].class);
            System.out.println(method.invoke(dog, new Object[]{new String[]{"a", "s", "d"}}));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
