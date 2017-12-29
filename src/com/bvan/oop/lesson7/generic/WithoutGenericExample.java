package com.bvan.oop.lesson7.generic;

import com.bvan.oop.lesson5.format.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WithoutGenericExample {

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("John");
        names.add(1);
        names.add(new Product("MacBook", 2000));

        Object o = names.get(1);
    }
}
