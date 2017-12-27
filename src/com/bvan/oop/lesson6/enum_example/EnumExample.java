package com.bvan.oop.lesson6.enum_example;

/**
 * @author bvanchuhov
 */
public class EnumExample {

    public static void main(String[] args) {
        // Get enum
        Genre g1 = Genre.DRAMA;

        // enum -> String
        String name = g1.name();
        System.out.println("name " + name);

        // enum -> int
        int ordinal = g1.ordinal();
        System.out.println("ordinal = " + ordinal);

        // String -> enum
        Genre g2 = Genre.valueOf("comedy".toUpperCase());
        System.out.println("g2 = " + g2);

        // int -> enum
        Genre[] values = Genre.values();
        Genre g3 = values[1];
        System.out.println("g3 = " + g3);
    }
}
