package com.bvan.oop.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayListSum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10, 30, 20));

        int sum = sum(list);
        System.out.println("sum = " + sum);
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer elem : list) {
            sum += elem;
        }
        return sum;
    }
}
