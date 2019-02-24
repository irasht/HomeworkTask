package com.training.task3;

import java.util.*;
import java.util.stream.*;

public class UsingStreams {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = Stream.generate(() -> random.nextInt(20))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(integerList);
        double average = integerList.stream().mapToDouble(Integer::intValue).average().getAsDouble();
        System.out.println("Average: " + average);
        System.out.println("Max: " + integerList.stream()
                .max(Integer::compareTo)
                .get());
        System.out.println("Min: " + integerList.stream()
                .min(Integer::compareTo)
                .get());
        System.out.println("First sum: " + integerList.stream()
                .mapToDouble(Integer::intValue)
                .sum());
        System.out.println("Second sum: " + integerList.stream()
                .reduce((x, y) -> x + y)
                .get());
        System.out.println("Count numbers bigger than average = " + integerList.stream()
                .filter((x) -> x > average)
                .count());
    }
}
