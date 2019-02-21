package com.arrays;

public class DeletionOfCouple {
    int[] delete(int[] input) {
        int current = input[0];
        boolean found = false;

        for (int i = 0; i < input.length; i++) {
            if (current == input[i] && !found) {
                found = true;
            } else if (current != input[i]) {
                System.out.print(" " + current);
                current = input[i];
                found = false;
            }
        }

        System.out.print(" " + current);
        return input;
    }
}
