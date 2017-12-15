package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public class JsonFormatterTest {

    public static void main(String[] args) {
        JsonFormatter jsonFormatter = new JsonFormatter();
        String s = jsonFormatter.format(new Product("iPhone", 999));
        System.out.println(s);
    }
}
