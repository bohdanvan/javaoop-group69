package com.bvan.oop.lesson7.generic.format;

/**
 * @author bvanchuhov
 */
public class LambdaExample {

    public static void main(String[] args) {
        Formatter<Product> nameFormatter = p -> p.getName();

        Product product = new Product("Lenovo", 1500);
        String s = nameFormatter.format(product);
        System.out.println(s);
    }
}
