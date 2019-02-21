package com.training;

import java.util.*;

public class ListStringIntoListInteger {

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        List list = listInt;
        list.add("word");
        int integer = listInt.get(0);
        String str = String.class.cast(listInt.get(0));
        System.out.println(str);
    }
}