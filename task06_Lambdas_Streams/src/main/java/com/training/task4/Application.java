package com.training.task4;

import java.util.*;
import java.util.stream.*;
public class Application {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Application app = new Application();
        List<String> stringLine = app.readString();
        System.out.println(stringLine);
        //Number of unique words
        long numbOfUnique = stringLine
                .stream()
                .flatMap(x -> Stream.of(x.split(" ")))
                .distinct()
                .count();
        // Sorted list of all unique words
        List<String> sortedUniqueWords = stringLine
                .stream()
                .flatMap(x -> Stream.of(x.split(" ")))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Number of unique words: " + numbOfUnique);
        System.out.println("Sorted Unique words: \n" + sortedUniqueWords);
        System.out.println("Count occurrence of of each word in the text\n" + app.countWords(stringLine));
        System.out.println("Count Symbols\n" + app.countLettersNotUpperCase(stringLine));

    }

    List<String> readString() {
        System.out.println("Please write some text.");
        List<String> list = new ArrayList<>();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            list.add(line);
        }
        return list;
    }

    // Word count. Occurrence number of each word in the text
    Map<String, Long> countWords(List<String> list) {
        return list.stream()
                .flatMap(x -> Stream.of(x.split(" ")))
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }

    // Occurrence number of each symbol except upper case characters
    Map<String, Long> countLettersNotUpperCase(List<String> list) {
        return list.stream()
                .flatMap(x -> Stream.of(x.split(" ")))
                .flatMap(x -> Stream.of(x.split("")))
                .filter(character -> !Character.isUpperCase(character.charAt(0)))
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }
}

