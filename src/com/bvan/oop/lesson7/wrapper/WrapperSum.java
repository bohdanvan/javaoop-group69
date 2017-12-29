package com.bvan.oop.lesson7.wrapper;

/**
 * @author bvanchuhov
 */
public class WrapperSum {

    public static void main(String[] args) {
        Integer x = 10; // Integer.valueOf(10);
        Integer y = 20; // Integer.valueOf(20);
        Integer z = x + y; // Integer.valueOf(x.intValue() + y.intValue())

        System.out.println(z);
    }
}
