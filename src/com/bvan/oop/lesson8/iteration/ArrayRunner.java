package com.bvan.oop.lesson8.iteration;

/**
 * @author bvanchuhov
 */
public class ArrayRunner {

    public static void main(String[] args) {
        Array array = new Array(new int[]{10, 15, 30, 20});

        for (Integer elem : array) {
            System.out.println(elem);
        }
    }
}
