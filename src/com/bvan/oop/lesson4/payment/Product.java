package com.bvan.oop.lesson4.payment;

import java.util.UUID;

/**
 * @author bvanchuhov
 */
public class Product {

    private final String id = UUID.randomUUID().toString();
    private final String name;
    private long price;

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
