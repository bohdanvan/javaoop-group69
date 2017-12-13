package com.bvan.oop.lesson4.shape.runner;

/**
 * @author bvanchuhov
 */
public class EarlyBindingExample {

    public static void main(String[] args) {
        int sum = sum(10, 20);
        System.out.println(sum);
    }

    private static int sum(int x, int y) {
        return x + y;
    }
}
