package com.training.task1;

public class Runner {
    public static void main(String[] args) {

        ThreeNumbers max = (n1, n2, n3) -> (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3;
        ThreeNumbers average = (n1, n2, n3) -> (n1 + n2 + n3) / 3;

        System.out.println(max.numbFunction(30, 5, 100));
        System.out.println(average.numbFunction(30, 5, 100));

    }
}
