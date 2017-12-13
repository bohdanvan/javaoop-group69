package com.bvan.oop.lesson4.payment;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author bvanchuhov
 */
public class Order {

    private static final String BOUGHT_STATUS = "BOUGHT";
    private static final String RETURNED_STATUS = "RETURNED";

    private final String id = UUID.randomUUID().toString();
    private final Product product;
    private String status;
    private LocalDateTime paymentTime;

    public Order(Product product) {
        this.product = product;
        this.status = BOUGHT_STATUS;
    }

    public void pay() {
        this.paymentTime = LocalDateTime.now();
    }

    public void returnOrder() {
        this.status = RETURNED_STATUS;
    }

    public String getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public long getPrice() {
        return product.getPrice();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", status='" + status + '\'' +
                ", paymentTime=" + paymentTime +
                '}';
    }
}
