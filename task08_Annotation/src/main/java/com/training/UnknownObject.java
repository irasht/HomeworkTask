package com.training;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UnknownObject {
    void readUnknownObject(Object object) {
        try {
            Class clazz = object.getClass();
            System.out.println("The name of class is " + clazz.getSimpleName());
            System.out.println("The name of class is " + clazz.getName());

            // Getting the constructor of the class
            Constructor constructor = clazz.getConstructor();
            System.out.println("The name of constructor is " + constructor.getName());
            //------------------------------------------------------------------------
            System.out.println("The declared methods of class are : ");
            Method[] methods = clazz.getMethods();
            // Printing method names
            for (Method method : methods) {
                System.out.println("  " + method.getName());
            }
            System.out.println();
            //------------------------------------------------------------------------
            System.out.println("The declared fields of class are : ");
            Field[] fields = clazz.getDeclaredFields();
            // Printing field names
            for (Field field : fields) {
                System.out.println("  " + field.getName());
            }
            System.out.println();
            //------------------------------------------------------------------------
            fields[0].setAccessible(true);
            if (fields[0].getType() == int.class) {
                fields[0].setInt(object, 47);
            }
            System.out.println(object);
            //------------------------------------------------------------------------
            Method methodcall = clazz.getDeclaredMethod("privateMethod");
            methodcall.setAccessible(true);
            // invokes the method at runtime
            methodcall.invoke(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UnknownObject unknownObject=new UnknownObject();
        Dog dog=new Dog();
        unknownObject.readUnknownObject(dog);
    }
}
