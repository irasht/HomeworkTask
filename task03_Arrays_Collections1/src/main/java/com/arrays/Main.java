package com.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CombinationOfTwoArrays combination = new CombinationOfTwoArrays();
        int[] arr = {1, 2, 3, 5, 8, 8, 4, 5};
        int[] arr1 = {1, 9, 8, 7, 4, 3};

        System.out.println(Arrays.toString(combination.isInOneArray(arr, arr1)));
        System.out.println(Arrays.toString(combination.areInTwoArrays(arr, arr1)));

        DeletionOfCouple deletion = new DeletionOfCouple();
        deletion.delete(new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10});
        System.out.println();
        deletion.delete(new int[]{3, 7, 7, 10, 1, 1, 8, 9, 9, 9});
        System.out.println();
        RemoveIfMoreThanTwo moreThanTwo = new RemoveIfMoreThanTwo();
        int[] arr3 = new int[]{3, 7, 7, 10, 1, 1, 8, 9, 9, 9};
        System.out.println(Arrays.toString(moreThanTwo.removeMoreThanTwo(arr3, 2)));
    }
}