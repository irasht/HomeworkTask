package com.training;

public class Container {
    private String[] strArray = new String[10];

    public void extendArray(int length) {
        String[] newArray = new String[length];
        for (int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray;
    }
}