package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public interface Formatter {

    String format(Product product);

    default void print(Product product) {
        System.out.println(format(product));
    }
}
