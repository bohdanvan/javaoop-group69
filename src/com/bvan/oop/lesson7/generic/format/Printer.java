package com.bvan.oop.lesson7.generic.format;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Printer<T> {

    private final List<T> values = new ArrayList<>();

    public void add(T value) {
        values.add(value);
    }

    public void print(Formatter<T> formatter) {
        for (T product : values) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
