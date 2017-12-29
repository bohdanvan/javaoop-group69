package com.bvan.oop.lesson7.wrapper;

/**
 * @author bvanchuhov
 */
public class WrapperExample {

    public static void main(String[] args) {
        // int -> Integer
        Integer x = Integer.valueOf(10);
        Integer y = 10; // autoboxing

        // Integer -> int
        int a = y.intValue();
        int b = y; // unboxing
    }
}
