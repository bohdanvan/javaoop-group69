package com.bvan.oop.lesson7.lambda;

import java.util.function.BiFunction;

/**
 * @author bvanchuhov
 */
public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mul =
                (a, b) -> a * b;

        Integer res = mul.apply(10, 20);
        System.out.println(res);

        BiFunction<String, Integer, Character> charAt = (s, i) -> s.charAt(i);

        Character c = charAt.apply("Hello", 1);
        System.out.println(c);
    }
}
