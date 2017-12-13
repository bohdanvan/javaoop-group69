package com.bvan.oop.lesson4.payment;

/**
 * @author bvanchuhov
 */
public class PaymentRunner {

    public static void main(String[] args) {
        User user = new User("Ivan", new MasterCardAccount());

        Order lenovoOrder = new Order(new Product("Lenovo", 1500));

        user.buy(new Order(new Product("MacBook", 2000)));
        user.buy(lenovoOrder);

        // some time

        user.returnOrder(lenovoOrder.getId());
    }
}
