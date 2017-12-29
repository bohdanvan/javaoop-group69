package com.bvan.oop.lesson7.generic.format;

/**
 * @author bvanchuhov
 */
public class NameFormatter implements Formatter<Product> {

    @Override
    public String format(Product value) {
        return value.getName();
    }
}
