package com.arrays;

public class RemoveIfMoreThanTwo {

    int[] removeMoreThanTwo(int[] array, int n) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(count(array, array[i]) > n)) {
                result[index++] = array[i];
            }
        }
        return chooseRange(result, 0, index);
    }

    int count(int[] arr, int element) {
        int counter = 0;
        for (int i : arr) {
            if (i == element) {
                counter++;
            }
        }
        return counter;
    }

    int[] chooseRange(int[] array, int from, int to) {
        int[] result = new int[to - from];

        for (int i = from; i < to; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
