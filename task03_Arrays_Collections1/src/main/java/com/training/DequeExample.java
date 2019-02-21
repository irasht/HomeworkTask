package com.training;

import java.util.*;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> states = new ArrayDeque<>();

        states.add("Ukraine");
        states.add("France");

        // add to start
        states.push("USA");

        // get first element without deletion
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while (states.peek() != null) {
            // get from beginning
            System.out.println(states.pop());
        }
        System.out.println("Deque size: " + states.size());
    }
}
