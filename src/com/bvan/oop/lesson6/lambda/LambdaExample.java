package com.bvan.oop.lesson6.lambda;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class LambdaExample {

    public static void main(String[] args) {
        int[] a = {10, 30, 50, 20};

        // imperative
        for (int elem : a) {
            if (elem > 25) {
                elem = elem * 10;
                System.out.println(elem);
            }
        }
        System.out.println();

        // declarative
        Arrays.stream(a)
                .filter(elem -> elem > 25)
                .map(elem -> elem * 10)
                .forEach(elem -> System.out.println(elem));
    }
}
