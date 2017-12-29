package com.bvan.oop.lesson7.sorting;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class SortingExample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(40, 10)); // > 0
        System.out.println(Integer.compare(20, 20)); // 0
        System.out.println();

        System.out.println("ABCD".compareTo("XFG")); // < 0
        System.out.println("Home".compareTo("House")); // < 0
        System.out.println("Homework".compareTo("Home")); // > 0
        System.out.println();

        LocalDate l1 = LocalDate.of(1990, 10, 20);
        LocalDate l2 = LocalDate.of(1990, 8, 10);
        System.out.println(l1.compareTo(l2)); // > 0
    }
}
