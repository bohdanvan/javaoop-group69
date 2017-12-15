package com.bvan.oop.lesson5.format.oop.runner;

import com.bvan.oop.lesson5.format.Product;
import com.bvan.oop.lesson5.format.oop.Cart;
import com.bvan.oop.lesson5.format.oop.CsvFormatter;
import com.bvan.oop.lesson5.format.oop.Formatter;
import com.bvan.oop.lesson5.format.oop.JsonFormatter;

/**
 * @author bvanchuhov
 */
public class PrinterRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

        cart.print(new JsonFormatter());
        System.out.println();

        Formatter formatter = new CsvFormatter();
        cart.print(formatter);
        System.out.println();
    }
}
