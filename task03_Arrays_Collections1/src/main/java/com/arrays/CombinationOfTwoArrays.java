package com.arrays;

import java.util.Random;

public class CombinationOfTwoArrays {
    int[] areInTwoArrays(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] arr = new int[length];
        int pos = 0;
        for (int element : array1) {
            arr[pos] = element;
            pos++;
        }

        for (int element : array2) {
            arr[pos] = element;
            pos++;
        }
        return arr;
    }

    public int[] isInOneArray(int[] array1, int[] array2) {
        int[] randArray = getRandomArray(array1, array2);
        int[] arr = new int[randArray.length];
        int pos = 0;
        for (int element : randArray) {
            arr[pos] = element;
            pos++;
        }
        return arr;
    }

    private int getRandomNumb() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private int[] getRandomArray(int[] array1, int[] array2) {
        int[] result = new int[0];
        switch (getRandomNumb()) {
            case 1:
            case 3:
                result = array1;
                break;
            case 0:
            case 2:

                result = array2;
            default:
                break;
        }
        return result;
    }
}
