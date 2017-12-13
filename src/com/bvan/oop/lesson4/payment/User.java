package com.bvan.oop.lesson4.payment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class User {

    private final String login;
    private final List<Order> orders = new ArrayList<>();
    private final Account account;

    public User(String login, Account account) {
        this.login = login;
        this.account = account;
    }

    public boolean buy(Order order) {
        boolean success = account.withdraw(order.getPrice());

        if (!success) {
            return false;
        }

        order.pay();
        orders.add(order);
        return true;
    }

    public boolean returnOrder(String orderId) {
        Order order = findOrder(orderId);
        if (order == null) {
            return false;
        }

        boolean success = account.credit(order.getPrice());
        if (!success) {
            return false;
        }

        order.returnOrder();
        return true;
    }

    /**
     * @return the order or null if order is not found.
     */
    private Order findOrder(String orderId) {
        for (Order order : orders) {
            if (order.getId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", orders=" + orders +
                ", account=" + account +
                '}';
    }
}
