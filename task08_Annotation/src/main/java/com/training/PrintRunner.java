package com.training;

import java.lang.reflect.*;

public class PrintRunner {
    public static void main(String[] args) {
        Example example = new Example();
        Example exampleWithText = new Example("hello world");

        Class c = example.getClass();
        Method method = null;

        try {
            method = c.getMethod("returnText");
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
            System.out.println(printAnnotation.text());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }

        try {
            method = c.getDeclaredMethod("returnText");
            System.out.println(method.invoke(exampleWithText));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
