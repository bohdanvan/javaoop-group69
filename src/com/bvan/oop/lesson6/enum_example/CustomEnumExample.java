package com.bvan.oop.lesson6.enum_example;

/**
 * @author bvanchuhov
 */
public class CustomEnumExample {

    public static void main(String[] args) {
        Genre comedy = Genre.COMEDY;
        System.out.println(comedy.shortName());

        System.out.println(comedy.getDescription());
    }
}
