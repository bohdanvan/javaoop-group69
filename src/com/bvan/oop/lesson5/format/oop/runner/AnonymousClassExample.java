//package com.bvan.oop.lesson5.format.oop.runner;
//
//import com.bvan.oop.lesson5.format.Product;
//import com.bvan.oop.lesson5.format.oop.Printer;
//import com.bvan.oop.lesson5.format.oop.Formatter;
//import com.bvan.oop.lesson5.format.oop.JsonFormatter;
//
///**
// * @author bvanchuhov
// */
//public class AnonymousClassExample {
//
//    public static void main(String[] args) {
//        Printer cart = new Printer();
//        cart.add(new Product("MacBook", 2000));
//        cart.add(new Product("Lenovo", 1500));
//        cart.add(new Product("Asus", 1700));
//
//        cart.print(toStringFormatter());
//        System.out.println();
//
//        cart.print(jsonFormatter());
//    }
//
//    private static Formatter jsonFormatter() {
//        return new JsonFormatter();
//    }
//
//    private static Formatter toStringFormatter() {
//        return new Formatter() {
//            @Override
//            public String format(Product product) {
//                return product.toString();
//            }
//        };
//    }
//}
